public class Stack {
    singleLinkedList linkedlist;
    //create
    public Stack(){
        linkedlist=new singleLinkedList();
    }
    //push
    public void push(int value){
        linkedlist.insertInLinkedList(value, 0);
        System.out.println("Inserted "+ value+" successfully");
    }
    //isEmpty method
    public boolean isEmpty(){
        if(linkedlist.head==null){
            return true;
        }else{
            return false;
        }
    }
    //pop method
    public int pop(){
        int result=-1; //no element return -1
        if(isEmpty()){
            System.out.println("The stack is empty");
        }else{
            result= linkedlist.head.value;
            linkedlist.deletionOfNode(0);//delete the first node

        }
        return result;
    }
    //peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            return linkedlist.head.value;
        }

    }
    //delete method
    public void delete(){
        linkedlist.head=null;
        System.out.println("The stack is deleted");
    }
}
