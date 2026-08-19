public class isPOwer_of_Two{
    public static boolean isPower_Of_two(int n){
       return (n&(n-1))==0;
        
        
    }
    public static void main(String args[]){
        System.out.println(isPower_Of_two(8));
                System.out.println(isPower_Of_two(17));


    }
}