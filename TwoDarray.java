import java.util.*;
public class TwoDarray{
    public static boolean SearchKey(int matrix[][],int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at the index " + "(" + i +  "," +  j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false; 
    }

    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                largest = Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println("Largest element in the matrix is : " + largest);

    }

    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                smallest = Math.min(smallest,matrix[i][j]);
            }
        }
        System.out.println("samllest element in the matrix is : " + smallest);

    }

    public static void main(String args[]){
        int matrix[][]= new int[3][3];
         int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][ j]= sc.nextInt();
            }
        }

         for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
int key = 25;
        SearchKey(matrix,key);
        largest(matrix);
        smallest(matrix);

    }
}