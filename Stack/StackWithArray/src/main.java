public class main {
    public static void main(String[] args) {
        Stack newStack= new Stack(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFull());
    }
}
