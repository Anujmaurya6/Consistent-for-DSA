package ARRAY.QUEUE.Revision;

public class STackwithmethod {
    static int[] arr=new int[10];
    static int size;
    static int top=-1;

    public static void push(int x) {
        if (top == size-1) {
            System.out.println("Stack full!");
        } else {
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }
    }
    
    public static int pop() {
        if (top == -1) {
            System.out.println("Stack empty!");
            return -1;
        }
        return arr[top--];
    }
    
    // Main method
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println("Popped: " + pop());
    }

    
}
