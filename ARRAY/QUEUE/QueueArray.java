package ARRAY.QUEUE;

public class QueueArray {
    static int size=10;
    static int front=0;
    static int rear=-1;
    static int count =0;
    static int [] queue=new int[size];

    //queue me add krna 

    static void enqueue(int value){
        if(count == size){
            System.out.println("queue  is full"+value);
            return ;
        }
        rear++;
        queue[rear] = value;
        count++;

    }
    //queue me remove karna
    static int dequeue(){
        if(count == 0){
            return -1;
        }
        int removed=queue[front];
        count--;
        front++;
        System.out.println("the element got removed"+removed);
        return removed;
    }
    //peek
    static int peek(){
        if (count == 0){
            System.out.println("the top element is "+queue[front]);
            return -1;
        }
         return queue[front];
    }
    //queue dekhna he idhar then
    static void display(){
         for(int i=front;i<=rear;i++){
            System.out.println("the qhole queue is"+queue[i]);
         }
         System.out.println();
    }
    // Main method
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40); // Add hoga
        enqueue(50); // Add hoga
        enqueue(60); // ERROR: Queue full
        
        display(); // 10 20 30 40 50
        
        dequeue(); // 10 nikal
        dequeue(); // 20 nikal
        
        display(); // 30 40 50
        
        System.out.println("Aage ka element: " + peek()); // 30
    }
}
