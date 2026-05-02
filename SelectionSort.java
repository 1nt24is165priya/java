import java.util.*;
public class SelectionSort{
    public static void selectionsort(int a[]){
        //int n = a.length;
        for(int i = 0; i<a.length-1;i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[i];
                a[i]=a[min];
                a[min]=temp;
            }               
        }
    }

    public static void printarr(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[]={5,2,15,32,9,13};
      //  int n = a.length;
        selectionsort(a);
        printarr(a);
    }
}