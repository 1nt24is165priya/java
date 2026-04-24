public class Kadanes_Negative {
    public static void KadanesMaxSum(int numbers[]) {
        int ms = numbers[0]; // start with first element
        int cs = numbers[0]; // current sum also starts with first element

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]); // extend or restart
            ms = Math.max(ms, cs); // update max
        }

        System.out.println("Max sum in the subarrays is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        KadanesMaxSum(numbers);
    }
}
