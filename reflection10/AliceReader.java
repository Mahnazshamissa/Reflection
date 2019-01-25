package reflection10;

import exe01.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class AliceReader {

    private FileReader reader = new FileReader();

    public List<String[]> readAlice() {
        return reader.asStream("reflection10/alice.txt")
                .map(String::toLowerCase)
                .map(e->e.replaceAll(","," "))
                .map(e->e.replaceAll(";"," "))
                .map(e->e.replaceAll("'s"," "))
                .map(e->e.replaceAll("-"," "))
                .map(e->e.replaceAll("/"," "))
                .map(e->e.replaceAll("‘"," "))
                .map(e->e.replaceAll("\\."," "))
                .map(e->e.replaceAll(":"," "))
                .map(e->e.replaceAll("#"," "))
                .map(e->e.replaceAll("'"," "))
                .map(e->e.replaceAll("\\*"," "))
                .map(e->e.replaceAll("\\("," "))
                .map(e->e.replaceAll("\\)"," "))
                .map(e->e.replaceAll("\\]"," "))
                .map(e->e.replaceAll("\\["," "))
                .map(e->e.split(" "))
                .collect(Collectors.toList());
    }
}
