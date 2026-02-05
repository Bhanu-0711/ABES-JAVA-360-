public class D3_Array{
    public static void main(String args[]){
        int [][][] matrix={
            {{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}
        };
        System.out.println("The 3D matrix is:  ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                for(int k=0;k<matrix[i][j].length;k++){
                    System.out.println(matrix[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}