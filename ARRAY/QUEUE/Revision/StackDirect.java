package ARRAY.QUEUE.Revision;

public class StackDirect {

    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        int size = 5;
        
        // Push
        if (top < size-1) {
            stack[++top] = 10;
            System.out.println("Pushed: 10");
        }
        
        if (top < size-1) {
            stack[++top] = 20;
            System.out.println("Pushed: 20");
        }
        
        // Pop
        if (top >= 0) {
            System.out.println("Popped: " + stack[top--]);
        }
        
        // Peek
        if (top >= 0) {
            System.out.println("Top: " + stack[top]);
        }
    }
}