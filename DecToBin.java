import java.util.*;
public class DecToBin{
    public static void decTobin(int n){
        int bin = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary number is : " + bin);
    }

    public static void binTodec(int binNum){
        int dec = 0;
        int pow = 0;
        while(binNum > 0){
        int lastDigit = binNum % 10;
        dec = dec +(lastDigit*(int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
        }
        System.out.println("Decimal number is : " + dec);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number: ");
        int n = sc.nextInt();
        decTobin(n);  
        System.out.println();
        System.out.println("Enter the binary number: ");
        int binNum = sc.nextInt();
        binTodec(binNum);
    }
}
