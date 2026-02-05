public class D2_Array{
    public static void main(String arge[]){
        int [][] matrix={
            {1,2,3},
            {4,5,6}
        };
        System.out.println("2D Matrix is: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}