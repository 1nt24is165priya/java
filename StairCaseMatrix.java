import java.util.*;
public class StairCaseMatrix{
    public static boolean searchSortedMatrix(int matrix[][],int key){
        int row = matrix.length-1,  col = 0;
        while( row >= 0 && col <= matrix[0].length-1 ){
            if(key == matrix[row][col]){
                System.out.println("key found at index (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;   
            }
            else{
                col++;

            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to find : ");
        int key = sc.nextInt();
        searchSortedMatrix(matrix,key);
    }
}