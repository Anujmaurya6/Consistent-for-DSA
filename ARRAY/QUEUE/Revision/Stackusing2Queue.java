package ARRAY.QUEUE.Revision;

import java.util.*;
public class Stackusing2Queue {
    //two queue
    private Queue<Integer> primaryqueue=new LinkedList<>();
    private Queue<Integer> secondaryqueue=new LinkedList<>();

    //push operations
    public void push(int val){
        primaryqueue.add(val);
        System.out.println("Pushed"+val);
  
    }

    //pop 
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        //transfer all elements except last one to secondary queue
        
    }
  

    
}
