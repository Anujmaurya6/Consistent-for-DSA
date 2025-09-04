public class Practice {
    public static void main(String[] args) {
        // Test your stack here
        Stack stack = new Stack();
        stack.createStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
    
    static class Stack {
        int arr[];
        int top;
        int size;

        // createStack should be void, not boolean
        public void createStack(int x) {
            size = x;
            arr = new int[x];
            top = -1;
            System.out.println("Stack created with size " + x);
        }

        public boolean push(int x) {
            if (top == size - 1) {
                System.out.println("The stack is full");
                return false;
            } else {
                arr[++top] = x;
                System.out.println("Pushed " + x + " to stack");
                return true;
            }
        }

        // pop method - return the value
        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                int value = arr[top--];
                System.out.println("Popped " + value + " from stack");
                return value;
            }
        }

        // peek method
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return arr[top];
            }
        }
        
        // Additional useful methods
        public boolean isEmpty() {
            return top == -1;
        }
        
        public boolean isFull() {
            return top == size - 1;
        }
        
        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}