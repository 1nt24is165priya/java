import java.util.*;
public class Sum_even_odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
            int even_sum = 0;
            int odd_sum = 0;
        for(int i = 1; i<=n; i++){
            //int even_sum = 0;
            //int odd_sum = 0;
            if(i%2==0){
                even_sum = even_sum+i;
            }
            if(i%2!=0){
                odd_sum = odd_sum+i;
            }
        }
        System.out.println("Sum of even integers is : " + even_sum);
        System.out.println("Sum of odd integers is : " + odd_sum);

    }

}