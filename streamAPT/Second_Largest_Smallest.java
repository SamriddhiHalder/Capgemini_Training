package streamAPT;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Second_Largest_Smallest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7, 5);

        List<Integer> sortedList = numbers.stream()
                                          .distinct()
                                          .sorted()
                                          .collect(Collectors.toList());

        if (sortedList.size() < 2) {
            System.out.println("Not enough unique elements to find second smallest/largest.");
        } else {
            int secondSmallest = sortedList.get(1);
            int secondLargest = sortedList.get(sortedList.size() - 2);

            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
