public class LinearQueue {
    int [] arr;
    int beginningOfQueue;
    int topOfQueue;

    //create
    public LinearQueue(int size){
        this.arr=new int[size];
        this.beginningOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("Queue created with the size of: "+size);
    }

    //isFull method
    public boolean isFull(){
        if(topOfQueue==arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    //isEmpty method
    public boolean isEmpty(){
        if(beginningOfQueue==-1||beginningOfQueue==arr.length){
            return true;
        }else{
            return false;
        }
    }
    //enQueue method
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The queue is full");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted: "+value);
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted: "+value);

        }
    }
    //deQueue Method
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            int result=arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;// making the queue empty
            }
            return result;
        }
    }
    //peek method
    public int peek(){
        if(!isEmpty()){
            return arr[beginningOfQueue];
        }else{
            System.out.println("The Queue is empty");
            return -1;
        }
    }
    //delete method
    public void delete(){
        arr=null;
        System.out.println("The Queue is successfully deleted");
    }

}
