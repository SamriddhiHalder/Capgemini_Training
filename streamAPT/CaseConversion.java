package streamAPT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConversion {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<String> upperCaseList = words.stream()
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperCaseList);

        List<String> lowerCaseList = words.stream()
                                          .map(String::toLowerCase)
                                          .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCaseList);
    }
}
