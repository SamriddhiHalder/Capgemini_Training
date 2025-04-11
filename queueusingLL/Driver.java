import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();
        int choice = 0;

        System.out.println("----- Queue using Linked List -----");

        while (choice != 6) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Peek");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    int removed = q.dequeue();
                    if (removed != -1)
                        System.out.println("Dequeued: " + removed);
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println(q.isEmpty() ? "Queue is empty." : "Queue is not empty.");
                    break;

                case 5:
                    int frontVal = q.peek();
                    if (frontVal != -1)
                        System.out.println("Front of queue: " + frontVal);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
