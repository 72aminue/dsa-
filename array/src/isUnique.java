public class isUnique {
    public static void main(String[] args) {
        isUnique mn=new isUnique();
        int[]intArray={1,2,3,4,6,5,6};
        if(mn.unique(intArray)){
            System.out.println("unique");
        }
        else{
            System.out.println("Not unique");
        }
    }
    public boolean unique(int[]intArray){
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
