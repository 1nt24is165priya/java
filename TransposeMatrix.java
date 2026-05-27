import java.util.*;

public class TransposeMatrix{
public static int[][] transpose(int matrix[][]){
    int row = 0, col = matrix[0].length;
    int n = matrix.length;
    int m = matrix[0].length;
   int transpose[][] = new int[m][n];
    
    while(row < n){
        for(int j = 0; j<col; j++){
            transpose[j][row] = matrix[row][j];
        }
        row++;
    }

    return transpose;

}

    public static void print(int transpose[][]){
        for(int i =0 ; i<transpose.length; i++){
            for(int j =0 ; j< transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6}};
        int transpose[][]= transpose(matrix);
        print(transpose);
    }


}