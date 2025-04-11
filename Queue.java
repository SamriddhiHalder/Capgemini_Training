
public class Queue {
	private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == capacity-1) {
            System.out.println("Queue is full.");
            return;
        }
        if(front==-1) {
        	front=0;
        }
        arr[++rear] = data;
       
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int value = arr[front];
        if(front==rear) {
        	front=rear=-1;
        } else {
        	front++;
        }
        
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return ;
        }
        System.out.print("Queue: ");
        for (int i = 0; i <=rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	

}
