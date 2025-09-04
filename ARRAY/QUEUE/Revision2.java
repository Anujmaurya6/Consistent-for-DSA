package ARRAY.QUEUE;

public class Revision2 {
    //stack using array

    int []arr=new int [10];
    int size=arr.length;
    int top=-1;

    //push 
    public void push(int x){
        if(top == size-1){
            System.out.println("stack is full cant add more");
        }else{
            arr[++top]=x;
            System.out.println("the element is finally pushed"+arr[top]);
        }
    }

    //pop
    public int pop(){
        if(top == -1){
            System.out.println("the stack is empty kuch he bhau idhar");
            return -1;
      }else{
        System.out.println("element poped is"+arr[top]);
      
      return arr[top--];      
}
    }

//peek
public int peek(){
    if(top == -1){
        System.out.println("Stack is empty");
        return -1;
    }else{
        System.out.println("the peek element is"+arr[top]);
    return arr[top];
    }
}
public static void main(String[] args) {
    Revision2 anuj=new Revision2();
    anuj.push(13);
    anuj.push(16);
    anuj.push(19);
    anuj.push(18);


    anuj.peek();
    anuj.pop();
    anuj.peek();


}
}
