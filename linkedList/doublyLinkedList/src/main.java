public class main {
    public static void main(String[] args) {
        doublyLinkedLIst dll= new doublyLinkedLIst();
        dll.createDLL(5);
        System.out.println(dll.head.value);
        dll.insertDLL(2,1);
        dll.insertDLL(3,2);
        dll.insertDLL(4,3);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
