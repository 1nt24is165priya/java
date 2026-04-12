public class Pairs_arrays{
    public static void pairs(int numbers[]){
        int tp = 0;
        for(int i = 0; i<numbers.length;i++){
            int current = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + current   + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        } 
        System.out.println("Toatal pairs = " + tp);
    }

    public static void main(String args[]){
        int numbers[]={2,4,7,9,6};
        pairs(numbers);
    }
}