package ARRAY.QUEUE.Revision;

public class STackwithstatic {
    static int[]arr=new int[10];
    static int top=-1;
    static int size=10;

    public static void main(String[] args) {
        //push
        if(top == size-1){
            System.out.println("STack is full cant add more");
        }else{
            arr[++top]=10;
            System.out.println("pushed");
        }

        //pop
        if(top == -1){
            System.out.println("Stack is empty nothing to pop");
        }else{
            int result=arr[++top];
            System.out.println(" lkwejf"+result);
        }
    }
}
