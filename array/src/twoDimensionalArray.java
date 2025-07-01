public class twoDimensionalArray {
    int[][]arr=null; //creating an empty array

    public twoDimensionalArray(int rowNum, int colNum){
        arr=new int[rowNum][colNum];
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }

    }

    public void insertValue(int row, int col, int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println();
            }else{
                System.out.println("The index is already occupied");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index you have provided are out of this array");
        }
    }
    public void accessCell(int row, int col){
        System.out.println("Accessing row: "+row+", col: "+ col);
        try{
            System.out.println("the value is  :"+arr[row][col]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The indecies you have inputed are out of bound");
        }
    }
    public void traverse2DArray(){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
    public void searchin2DArray(int valueToSearch){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==valueToSearch){
                    System.out.println("Value has been found in row: "+ row+ ", col:"+ col);
                    return; //stoping the main for loop
                }
            }
        }
        System.out.println("Value hasn't been found");
    }
    public void deletein2DArray(int row, int col){
        try{
            arr[row][col]=Integer.MIN_VALUE;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The indecies you have provided are out of this array");
        }
    }
}
