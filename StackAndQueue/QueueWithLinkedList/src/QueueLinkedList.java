public class QueueLinkedList {
    singleLinkedList linkedlist;
    //create
    public QueueLinkedList(){
        linkedlist= new singleLinkedList();
        System.out.println("The queue has been created");
    }
    //isEmpty
    public boolean isEmpty(){
        if(linkedlist.head==null){
            return true;

        }else{
            return false;
        }
    }
    //enQueue
    public void enQueue(int value){
        linkedlist.insertInLinkedList(value, linkedlist.size);
        System.out.println("SuccessFully inserted value: "+ value);
    }
    //deQueue
    public int deQueue(){
        int value=-1;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            value= linkedlist.head.value;
            linkedlist.deletionOfNode(0);
        }
        return value;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            return  linkedlist.head.value;

        }
    }
    //delete
    public void deleteQueue(){
        linkedlist.head= linkedlist.tail=null;
        System.out.println("The Queue has been deleted");
    }
}
