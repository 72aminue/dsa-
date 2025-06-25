public class singleDimensionArray {
    int[] arr = null;

    public singleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index to access array");
        }
    }
    public void traverseArray(){
        try {
            for (i == 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");

            }
        }catch (Exception e){
            System.out.println("Array no longer available");
        }
    }
}
