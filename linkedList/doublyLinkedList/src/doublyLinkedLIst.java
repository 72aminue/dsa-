public class doublyLinkedLIst {
    public doublyNode head;
    public doublyNode tail;
    public int size;

    //creating doubly Linked list with one node
    public doublyNode createDLL(int nodeValue){

        doublyNode newNode= new doublyNode();
        newNode.value=nodeValue;
        newNode.next=newNode.prev=null;
        head=tail=newNode;
        size=1;
        return head;
    }

    // insertion
    public void insertDLL(int nodeValue, int location){
        doublyNode newNode =new doublyNode();
        newNode.value=nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;

        }
        //inserting at the beginning
        else if(location==0){
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        //inserting at the end
        else if(location>=size){
            newNode.next=null;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        //insertion at any given point
        else{
            doublyNode tempNode= head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;

            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            newNode.next.prev=newNode;
        }
        size++;
    }
    //traverse
    public void traverseDLL(){
        if(head!=null){
            doublyNode tempNode= head;
            for(int i=0; i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;

            }

        }else{
            System.out.println("The dll doesnt exist");
        }
        System.out.println();

    }
    //Reverse Traverse
    public void reverseTraverseDLL(){
        if(head!=null){
            doublyNode tempNode= tail;
            for (int i=0; i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<-");
                }
                tempNode=tempNode.prev;

            }

        }else{
            System.out.println("The DLL doesnt exist");
        }
        System.out.println();

    }
    //searching
    public boolean searchNode(int nodeValue){
        if(head!=null){
            doublyNode tempNode= head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("The node has found at location: "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }
    //deleting Nodes

    public void deleteNode(int location){
        if(head==null){
            System.out.println("The dll doesn't exist");
            return;
        }else if(location==0){
            if(size==1){
                head=tail=null;
                size--;
                return;
            }else{
                head=head.next;
                head.prev=null;
                size--;
            }
        }else if(location>=size){
            doublyNode tempNode= tail.prev;
            if(size==1){
                head=tail=null;
                size--;
                return;
            }else{
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
        }else{
            doublyNode tempNode=head;
            for(int i=0; i<location-1; i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }
    //delete Entire linked list
    public void deleteDLL(){
        doublyNode tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=tail=null;
        System.out.println("The DLL has been deleted");
    }
}
