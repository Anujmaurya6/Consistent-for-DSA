package ARRAY.QUEUE.Revision;

public class StackusingArray {
    int []arr;
    int top=-1;
    int size;
    
 public void push(int x){
    if(top == size-1){
        System.out.println("Stack is overflow");
    }else{
        arr[++top]=x;
    }
 }

 public int pop(int x){
    if(top == size-1){
        System.out.println("Stack is empty");
        return -1;
    }else{
    return arr[top--];
 }
}

 //peek
 public int peek(){
    if(isEmpty()){
        System.out.println("the stack is empty");
    }else{
        return arr[top];
    }
 }


    
}
