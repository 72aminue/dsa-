public class intPermutation {
    // both array have same elements doesnt matter index
    //this solutoin is only for integer array
    public static void main(String[] args) {
        intPermutation mn=new intPermutation();
        int[]Array1={1,2,0,4,5};
        int[]Array2={1,2,3,4,5};
        if(mn.permutation(Array1,Array2)){
            System.out.println("Permutation");
        }
        else{
            System.out.println("Not permutation");
        }

    }

    public boolean permutation(int[] intArray1, int[] intArray2) {
        if(intArray1.length!= intArray2.length){
            return false;
        }
        int sum1 = 0, sum2 = 0;
        int mult1 = 1, mult2 = 1;
        for (int i = 0; i < intArray1.length; i++) {
            sum1 += intArray1[i];
            mult1 *= intArray1[i];
            sum2 += intArray2[i];
            mult2 *= intArray2[i];
        }
        if (sum1 == sum2 && mult1 == mult2) {
            return true;
        } else {
            return false;
        }
    }
}
