public class maxProduct {
    public static void main(String[] args) {
        maxProduct mn=new maxProduct();
        int[]intArray={1,2,4,3,5,7,9};
        System.out.println(mn.product(intArray));

    }

    public String product(int[]intArray){
        int maxProduct=0;
        String pairs="";
        for(int i=0; i< intArray.length;i++){
            for(int j=i+1; j< intArray.length; j++){
                int product=intArray[i]*intArray[j];
                if(product>maxProduct){
                    maxProduct=product;
                    pairs=Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
