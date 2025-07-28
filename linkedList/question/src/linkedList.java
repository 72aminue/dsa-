public class linkedList {
    public Node head;
    public Node tail;
    public int size;
    //creating Linked List
    public void createLL(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head=tail=newNode;
        size=1;
    }
    //Inserting the end of a Linked List

    public void insert(int nodeValue){
        if(head==null){
            createLL(nodeValue);
            return;
        }
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;

    }
    //Traverse
    public void traverseLL(){
        Node tempNode= head;
        for(int i=0; i<size; i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print(" ->");
            }
            tempNode=tempNode.next;
        }
        System.out.println("\n");
    }
}
