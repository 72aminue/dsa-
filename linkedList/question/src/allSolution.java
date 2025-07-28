import java.util.HashSet;
public class allSolution {
    //delete duplicates
    public void deleteDups(linkedList ll){
        HashSet<Integer> hs= new HashSet<>();
        Node currentNode= ll.head;
        Node prevNode= null;
        while(currentNode!=null){
            int curVal= currentNode.value;
            if(hs.contains(curVal)){
                prevNode.next=currentNode.next;
                ll.size--;
            }else{
                hs.add(curVal);
                prevNode=currentNode;
            }
            currentNode=currentNode.next;
        }
    }
    //nth item from last element
    public Node nthFromLast(linkedList ll, int n){
        Node p1= ll.head;
        Node p2=ll.head;
        for(int i=0;i<n;i++){
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
    //Partition

    public linkedList partition(linkedList ll, int x){
        Node currentNode=ll.head;
        ll.tail=ll.head;
        while(currentNode!=null){
            if(currentNode.value<x){
                currentNode.next=ll.head;
                ll.head=currentNode;
            }else{
                ll.tail.next=currentNode;
                ll.tail=currentNode;
            }
            currentNode= currentNode.next;
        }
        ll.tail.next=null;
        return ll;
    }
    //sumList
    public linkedList sumList(linkedList llA, linkedList llB){
        Node n1= llA.head;
        Node n2= llB.head;
        int carry=0;
        linkedList resultll= new linkedList();
        while(n1!=null||n2!=null){
            int result= carry;
            if(n1!=null){
                result+=n1.value;
                n1=n1.next;
            }
            if(n2!=null){
                result+=n2.value;
                n2=n2.next;

            }
            resultll.insert(result%10);
            carry=result/10;
        }
        return resultll;

    }

    // intersection(find interseting node)
    //helping method to insert same node in the two linkedList
    public void sameNode(linkedList llA, linkedList llB, int nodeValue){
        Node newNode= new Node();
        newNode.value=nodeValue;
        llA.tail.next=newNode;
        llA.tail=newNode;
        llB.tail.next=newNode;
        llB.tail=newNode;


    }
    //get kth Node (hwo many nodes we have to kick out from the longer node)
    public Node getKthNode(Node head, int k){
        Node current=head;
        while(k>0&&current!=null){
            current=current.next;
            k--;
        }
        return current;
    }
    //Intersection Method

    public Node findIntersection(linkedList l1, linkedList l2){
        if(l1.head==null&& l2.head==null) return null;
        if(l1.tail!=l2.tail) return null;
        Node shorter= new Node();
        Node longer= new Node();
        if(l1.size>l2.size){
            longer= l1.head;
            shorter= l2.head;

        }else{
            longer= l2.head;
            shorter= l1.head;
        }
        longer=getKthNode(longer, Math.abs(l1.size-l2.size));
        while(shorter!=longer){
            shorter= shorter.next;
            longer= longer.next;
        }
        return longer;// return shorter will be alright too

    }


}
