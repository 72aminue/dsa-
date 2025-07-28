public class main {
    public static void main(String[] args) {
        linkedList l1= new linkedList();
        linkedList l2= new linkedList();
        l1.insert(1);
        l2.insert(2);
        l1.insert(3);
        l2.insert(4);
        allSolution q= new allSolution();
        q.sameNode(l1,l2,5);
        q.sameNode(l1,l2,6);
        q.sameNode(l1,l2,7);
        q.sumList(l1,l2);


    }
}
