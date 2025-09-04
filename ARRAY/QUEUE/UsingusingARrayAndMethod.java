package ARRAY.QUEUE;

public class UsingusingARrayAndMethod {

    static int size = 10;
    static int front = 0;
    static int rear = -1;
    static int count = 0;
    static int[] queue = new int[size];

    // queue me add krna

    static void enqueue(int value) {
        if (count == size) {
            System.out.println("queue  is full" + value);
            return;
        }
        rear++;
        queue[rear] = value;
        count++;

    }

    // queue me remove karna
    static int dequeue() {
        if (count == 0) {
            return -1;
        }
        int removed = queue[front];
        count--;
        front++;
        System.out.println("the element got removed" + removed);
        return removed;
    }

    public static void main(String[] args) {
    }
}
