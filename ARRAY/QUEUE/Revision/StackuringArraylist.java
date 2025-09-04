package ARRAY.QUEUE.Revision;
import java.util.*;

public class StackuringArraylist {
    public static void main(String[] args) {
        
    
    Stack<Integer> stack=new Stack<>();
    
    //push ke liye
    stack.add(16);
    stack.add(18);
    stack.add(17);
    stack.add(11);
    System.out.println("element is pushed"+stack);

    //pop ke liye
    if(stack.isEmpty()){
        System.out.println("stack is empty ");
    }else{
         int top = stack.pop();  
        System.out.println("the poped element is"+top);
    }
}
}
