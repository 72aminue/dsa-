public class circularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //create a circular single liked list with one node
    // will return head node
    public Node createCSLL(int nodeValue){
        Node node =new Node();
        node.value=nodeValue;
        node.next=node;
        head=tail=node;
        size=1;
        return head;
    }

    //Insertion in circularSinglyLinked List

    public void insertCSLL(int nodeValue, int location){
        Node node= new Node();
        node.value=nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }
        //inserting node at the start of the linked list
        else if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        //inserting node at the at the end of the linked list
        else if(location>=size){
            tail.next=node;
            tail=node;
            tail.next=head;

        }
        //inserting in any position in between first and last
        else{
            Node tempNode= head;
            int index=0;
            while(index<location-1){
                tempNode= tempNode.next;
                index++;
            }
            node.next=tempNode.next;
            tempNode.next=node;
        }
        size++;
    }
    //traverse linked list
    public void traverseCSLL(){
        if(head!=null){
            Node tempNode=head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }else{
            System.out.println("CSLL doesn't exist");
        }
    }
    //searching a node in linked list
    public boolean searchNode(int nodeValue){
        if(head!=null){
            Node tempNode=head;
            for(int i=0; i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Node found at, index: "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node has not been found");
        return false;
    }
    //deletion of A node
    public void deleteNode(int location){
        if(head==null){
            System.out.println("The csll doesn't exist");
            return;
        }
        //deleting the first cell
        else if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                tail=null;
                head.next=null;
                head=null;
            }
            //deleting from the last position
            else if(location>=size){
                Node tempNode=head;
                for(int i=0; i<size-1;i++){
                    tempNode=tempNode.next;
                }
                if(tempNode==head){
                    head.next=null;
                    head=tail=null;
                    size--;
                    return;

                }
                tempNode.next=head;
                tail=tempNode;
                size--;
            }
            //deleting from any place in the linked list
            else{
                Node tempNode=head;
                for(int i=0; i<location-1;i++){
                    tempNode=tempNode.next;
                }
                tempNode.next=tempNode.next.next;
                size--;
            }
        }
    }
    //delete the entire circular singly linked list
    public void deleteCSLL(){
        if(head==null){
            System.out.println("The CSLL doesn't exist");
        }else{
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("The CSLL has been deleted");
        }
    }
}
