package streamAPT;
import java.util.Arrays;
import java.util.List;

public class CountString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Steve", "Sarah", "John", "Sophie");

        char prefix = 'S';
        long count = names.stream()
                          .filter(name -> name.startsWith(String.valueOf(prefix)))
                          .count();

        System.out.println("Count of names starting with '" + prefix + "': " + count);
    }
}
