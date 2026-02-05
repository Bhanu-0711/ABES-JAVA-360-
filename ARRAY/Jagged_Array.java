class Jagged_Array{
    public static void main(String args[]){
        int [][] jagged=new int [2][];      //initailised the array as 2 rows and we can have as many columns
        jagged[0]=new int[2];               //in first row we have 2 elements
        jagged[1]=new int[3];               //in second row we have 3 elements

        jagged[0][0]=10;                    //row 1 element 1
        jagged[0][1]=20;                    //row 1 element 2
        jagged[1][0]=30;                    //row 2 element 1
        jagged[1][1]=40;                    //row 2 element 2
        jagged[1][2]=50;                    //row 2 element 3

        System.out.println("Jagged Array");
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.println(jagged[i][j]);
            }
            System.out.println();
        }
    }
}