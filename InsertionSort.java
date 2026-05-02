import java.util.*;
public class InsertionSort{
    public static void insertionsort(int a[]){
        //int n = a.length;
        for(int i = 1; i<a.length;i++){
            int key = a[i];
            int j = i -1;
            while(j>=0 && a[j] > key) {
                a[j+1]=a[j];
                j--;
            } 
            a[j+1]=key;            
        }
    }

    public static void printarr(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[]={5,2,15,32,9,13};
        insertionsort(a);
        printarr(a);
    }
}