public class Stack {
    int [] arr;
    int topOfStack;
    //creating array
    public Stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1; //-1 when the Stack is empty
        System.out.println("The Stack has been created with size: "+size );
    }
    //isEmpty method (check if the array is empty or not)
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;

        }else{
            return false;
        }
    }
    //isFull method (check if the stack is full or not)
    public boolean isFull(){
        if(topOfStack==arr.length-1){
            System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }
    //push method
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full, No space for new element");
        }else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }
    //pop method
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int topStack=arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    //peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }
    //delete entire stack

    public void delete(){
        arr=null;
        System.out.println("The array is deleted");
    }

}
