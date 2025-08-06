public class singleLinkedList {
    public Node head;// this is a node that indicates the first node's memory space
    public Node tail;// a node that incates the memory space of the last node
    public int size;// the size will be increased with the amount of nodes we will input


    //creating a one value single linked list
    //it takes the value of the node we are creating as parameter
    //and it will return head
    public Node createSingleLinkedList(int nodeValue) {
        Node node = new Node(); // node we are going to add int this linked list
        node.next = null; //as it is the single node in this list then the next reference of this will be null;
        node.value = nodeValue; // assigning the nodeValue
        head = node;// means head will now indicate the next node to it as the node we created
        tail = node;
        size = 1;
        return head;
    }


    public void insertInLinkedList(int nodeValue, int Location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;// to terminate the method
        }else if(Location==0){
          node.next=head;
          head=node;
        }else if(Location>=size){
            node.next=null;
            tail.next=node;// tail is pointing to the last node
            tail=node;
        }else{
            Node tempNode= head;
            int index=0;
            while(index<Location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode= tempNode.next;
            tempNode.next=node;
            node.next= nextNode;

        }
        size++;
    }
    // traversal of single  linked list
    public void traverseSingleLinkedList(){
        if(head==null){
            System.out.println("SLL does not exist");
        }else{
            Node tempNode= head;
            for(int i=0; i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("\n");
    }

    public boolean searchNodes(int nodeValue){
        if(head!=null){
            Node tempNode= head;
            for(int i=0; i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Found at location #"+i+"\n");
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Value has not been found");
        return false;
    }
    public void deletionOfNode(int location){
        if(head==null){
            System.out.println("The SLL doesn't exist");
            return;
        //delete the first node
        }else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        //delete the last node
        }else if(location>=size){
            Node tempNode=head;
            for(int i=0; i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode.next==head){
                tail=head=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }else{
              Node tempNode=head;
              for(int i=0; i<location-1;i++){
                  tempNode=tempNode.next;
              }
              tempNode.next=tempNode.next.next;
              size--;

        }
    }
    //deleting the whole sigly iinked list
    public void deleteEntireLinkedList(){
        head=tail=null;
        System.out.println("The SLL is successFully Deleted");
    }

}
