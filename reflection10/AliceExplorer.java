package reflection10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceExplorer {
    private AliceReader aliceReader = new AliceReader();
    private List<String[]> words = aliceReader.readAlice();

    public Long getNumberOfWords(){
        return words.stream()
                .count();
    }
public Long getNumberOfDistinctWords(){
        return words.stream()
                .distinct()
                .count();
    }

    public List<String[]> getLongestWords(){
        return words.stream()
                .filter(e->e.length>15)
                .collect(Collectors.toList());
    }
    public String getMostAppearing5Words() {
        return words.stream()
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()) )
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.joining());

    }
    public String getMostAppearing5Letters() {
        return words.stream()
                .map(e->e.split"")
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()) )
                .map(e -> e.getValue() + " | " + e.getKey())
                .limit(5)
                .collect(Collectors.joining());

    }
}
