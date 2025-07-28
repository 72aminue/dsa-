public class circularDoublyLinkedList {
    public doublyNode head;
    public doublyNode tail;
    public int size;
  
    //creating a circular doubly linked list
    public doublyNode createCDLL(int nodeValue){
        doublyNode newNode= new doublyNode();
        newNode.value= nodeValue;
        head=tail=newNode;
        newNode.next=newNode;
        newNode.prev=newNode;
        size=1;
        return head;
    }
    //Insertion

    public void insertCDLL(int nodeValue, int location){
        doublyNode newNode=new doublyNode();
        newNode.value=nodeValue;
        if(head==null){
            createCDLL(nodeValue);
            return;

        }
        //insert at the start
        else if(location==0){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
        }
        //insert in the end
        else if(location>=size){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            tail=newNode;
        }
        //any other location
        else{
            doublyNode tempNode=head;
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
    public void traverseCDLL(){
        if(head!=null){
            doublyNode tempNode=head;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
        }else{
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }
    //reverse Traverse

    public void reverseTraverseCDLL(){
        if(head!=null){
            doublyNode tempNode=tail;
            for(int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<-");
                }
                tempNode=tempNode.prev;
            }
        }else{
            System.out.println("CDLL does not exist");
        }
        System.out.println();
    }
    //searching

    public boolean searchNode(int nodeValue){
        if(head!=null){
            doublyNode tempNode= new doublyNode();
            for(int i=0; i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Node has been found at location: "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node has not been found");
        return false;
    }

    //delete Node
    public void deleteNode(int location){
        if(head==null){
            System.out.println("The CDLL does not exist");
        }
        //delete first item
        else if(location==0){
            if(size==1){
                head.prev=null;
                head.next=null;
                head=tail=null;
                size--;
                return;
            }
            else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
                size--;

            }

            }//delete last item
            else if(location>=size){
              if(size==1){
                 head.prev=null;
                 head.next=null;
                 head=tail=null;
                 size--;
                 return;
              }else{
                  tail=tail.prev;
                  tail.next=head;
                  head.prev=tail;
                  size--;
              }

        }else{
                doublyNode tempNode= head;
                for(int i=0; i<location-1; i++){
                    tempNode=tempNode.next;
                }
                tempNode.next=tempNode.next.next;
                tempNode.next.prev=tempNode;
                size--;
        }

    }
    //delete entire CDLL
    //main idea is make the cdll a SLl first and follow the same way to deleteSLL
    public void deleteCDLL(){
        doublyNode tempNode= head;
        for(int i=0; i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        System.out.println("The CDLL has been deleted");
    }


}
