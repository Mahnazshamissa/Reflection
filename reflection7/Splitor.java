package week7Exercises.reflection7;

import java.util.Arrays;
import java.util.List;

public class Splitor {
    public List<String> split(String input) {
        String[] line = input.split(";");
        return Arrays.asList(line);
    }
}
