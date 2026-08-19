public class Check_SetBits{
    public static int Check_Setbits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println("Number of set bits is : " + Check_Setbits(10));
        System.out.println("Number of Set bits is : " + Check_Setbits(15));

    }
}