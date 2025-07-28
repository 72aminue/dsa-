public class main {
    public static void main(String[] args) {
//        doublyLinkedLIst dll= new doublyLinkedLIst();
//        dll.createDLL(5);
//        System.out.println(dll.head.value);
//        dll.insertDLL(2,1);
//        dll.insertDLL(3,2);
//        dll.insertDLL(4,3);
//        dll.traverseDLL();
//        dll.reverseTraverseDLL();
//        dll.deleteDLL();
//        dll.traverseDLL();


        circularDoublyLinkedList cdll=new circularDoublyLinkedList();
        cdll.createCDLL(1);
        System.out.println(cdll.head.value);
        cdll.insertCDLL(2,1);
        cdll.insertCDLL(3,2);
        cdll.insertCDLL(4,3);
        cdll.insertCDLL(5,4);
        cdll.insertCDLL(6,5);
        cdll.traverseCDLL();
        cdll.reverseTraverseCDLL();
    }
}
