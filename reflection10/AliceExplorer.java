package reflection10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceExplorer {
    private AliceReader aliceReader = new AliceReader();
    private List<String> words = aliceReader.readAlice();

    public Long getNumberOfWords() {
        return words.stream()
                .count();
    }

    public Long getNumberOfDistinctWords() {
        return words.stream()
                .distinct()
                .count();
    }

    public List<String> getLongestWords() {
        return words.stream()
                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public List<String> getMostAppearing5Words() {
        return words.stream()
                //.flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());

    }

    public List<String> getMostAppearing5Letters() {
        return words.stream()
                .map(e->e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.toList());

    }

    public long getNumberOfAlice() {
        return words.stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
    }
}
