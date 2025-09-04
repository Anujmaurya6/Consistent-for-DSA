package ARRAY.QUEUE.Revision;

public class StackusingLL {
   
   static class Node{
    int data;
    Node next;
   }

   Node top;

   //push ke liye code
   void push(int data){
    Node newNode=new Node();
    newNode.data=data;
    newNode.next=top;
    top=newNode;
    System.out.println("pushed to stack");
   }

   //pop ke liye code
   int pop(){
    if(top == null){
        System.out.println("stack is empty");
        return -1;
    }else{
        int data=top.data;
        top=top.next;
        System.out.println("popped from stack"+data);
        return data;
    }
   }

   //peek 
   int peek(){
    if(top == null){
        System.out.println("stack is empty");
        return -1;
    }
    else{
    System.out.println("top element is");
    return top.data;
    }
   }

    
}

