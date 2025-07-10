
public class Search {
    public static void main(String[] args) {

        Search mn= new Search();
        int[] intArray={1,2,4,5,6,7};
        mn.linearSearch(intArray, 5);

    }

    public void linearSearch(int[]intArray, int value){
        for(int i=0; i< intArray.length;i++ ){
            if(intArray[i]==value){
                System.out.println(" the value has been found at "+ i+ " index");
                return;
            }


        }
        System.out.println("No such value in the array");
    }
}
