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
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");

            }
        }catch (Exception e){
            System.out.println("Array no longer available");
        }
    }
    public void searchinArray(int valueToSearch){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==valueToSearch){
                System.out.println("Value is found at the index: "+i);
                return; // to stop the loop
            }
        }
        System.out.println(valueToSearch+ " hasn't been found");
    }

    public void deleteValue(int indexValueToDelete){
        try{
            arr[indexValueToDelete]=Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index you have provided is out of the array");
        }
    }
}
