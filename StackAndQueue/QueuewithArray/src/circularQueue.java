public class circularQueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;
    //create
    public circularQueue(int size){
        this.arr=new int[size];
        this.size=size;
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("The CQ has been created with: "+size);
    }
    //isEmpty method
    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }else{
            return false;
        }
    }
    //isFull method
    public boolean isFull(){
        if(topOfQueue++==beginningOfQueue){
            return true;
        }else if(beginningOfQueue==0 && topOfQueue+1==size){
            return true;
        }else{
            return false;
        }
    }
    //enqueue method
    public void enQueue(int value){
        if(isFull()){
            System.out.println("the CQ is full");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted: "+value);
        }else{
            if(topOfQueue+1==size){
                topOfQueue=0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted: "+value);
        }
    }
    //deQueue method
    public int deQueue(){
        if(isEmpty()){
            System.out.println("CQ is empty");
            return -1;
        }else{
            int result= arr[beginningOfQueue];
            arr[beginningOfQueue]=0; //can be set to minumum integer, it's cause we are removing value from our array
            if(beginningOfQueue==topOfQueue){
                beginningOfQueue=topOfQueue=-1;

            }else if(beginningOfQueue+1==size){
                beginningOfQueue=0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }
    //peek method

    public int peek (){
        if(isEmpty()){
            System.out.println("The CQ is empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }
    //delete CQ
    public void deleteCQ(){
        arr=null;
        System.out.println("CQ is deleted");
    }
}
