public class Main {
    public static void main(String[] args) {
        singleDimensionArray sda=new singleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);

        System.out.println("Array Traverseal");
        sda.traverseArray();


    }
}
