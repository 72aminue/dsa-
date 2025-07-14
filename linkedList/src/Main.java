public class Main {
    public static void main(String[] args) {
        singleLinkedList sLL=new singleLinkedList();
//        sLL.createSingleLinkedList(5);

//        sLL.insertInLinkedList(6,1);
//        sLL.insertInLinkedList(7,2);
//        sLL.insertInLinkedList(8,3);
//        sLL.insertInLinkedList(9,4);
//        sLL.traverseSingleLinkedList();
//        sLL.deleteEntireLinkedList();
//        sLL.traverseSingleLinkedList();
        circularSinglyLinkedList cSLL= new circularSinglyLinkedList();
        cSLL.createCSLL(8);
        System.out.println(cSLL.head.value);
    }

}

