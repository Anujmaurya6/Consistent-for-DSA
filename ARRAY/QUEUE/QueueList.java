package ARRAY.QUEUE;

import java.util.ArrayList;

public class QueueList {
    static ArrayList<Integer> queue=new ArrayList<>();

    //queue me add karna
    static void enqueue(int x){
        queue.add(x);
        System.out.println("the queue is "+x);
    }

    //queue se remove karna
static int dequeue(){
    if(queue.isEmpty()){
        System.out.println("the queue is empty");
        return -1;
    }else{
        int removedValue=queue.remove(0);
    System.out.println("the queue is"+removedValue);
    return removedValue;
    }
}

//aage ka element dekhna
static int peek(){
    if(queue.isEmpty()){
        System.out.println("the queue is empty");
        return -1;
    }else{
    return queue.get(0);
}
}

//queue dikhana
static void display(){
    if(queue.isEmpty()){
        System.out.println("the queue is empty");
     return;
    }else{
        System.out.println("the queue is"+queue); 
    }
}
// Main method
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        
        display(); // [10, 20, 30]
        
        dequeue(); // 10 nikal
        dequeue(); // 20 nikal
        
        display(); // [30]
        
        enqueue(40);
        enqueue(50);
        
        display(); // [30, 40, 50]
        
        System.out.println("Aage ka element: " + peek()); // 30
    }
}
