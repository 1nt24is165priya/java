public class DiagonalSum{
    public static int diagonalMatrix(int matrix[][]){
        int sum = 0;
        for(int i =0; i<matrix.length;i++){
            //Primary diagonal
             sum = sum + matrix[i][i];

            //Secondary diagonal
            if(i != matrix.length-i-1){
             sum = sum + matrix[i][matrix.length-i-1];
            }

        }
        return sum;

    }

    public static void main(String args[]){
    int matrix[][] = {{0,1,2},{3,4,5},{6,7,8}};
    //int sum = 0;
    System.out.println(diagonalMatrix(matrix));
    }
}