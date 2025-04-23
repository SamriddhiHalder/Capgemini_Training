package streamAPT;
import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1);

        int max = numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        int min = numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
