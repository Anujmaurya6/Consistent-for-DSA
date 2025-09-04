package ARRAY.QUEUE.Revision;

import java.util.ArrayList;

public class StackusingArraylist {
    public static void main(String[] args) {
        
    ArrayList<Integer> stack =new ArrayList<>();

    stack.add(10);
    stack.add(23);
    stack.add(70);
    System.out.println("stack"+stack);


//pop ke liye

if(stack.isEmpty()){
    System.out.println("the stack is empty");
}else{
    int top=stack.remove(stack.size()-1);
    System.out.println("top element"+top);
}

//peek 
if(stack.isEmpty()){
    System.out.println("the stack is empty");
}else{
    int top=stack.get(stack.size()-1);
    System.out.println("Top element is"+top);
}
    }
}

