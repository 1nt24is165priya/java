public class Subarrays {
    public static void Subarrays(int numbers[]) {
        int ts = 0; // total subarrays
        int maxSum = Integer.MIN_VALUE; // start with very small number
        int minSum = Integer.MAX_VALUE; // start with very large number

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                int sum = 0; // reset sum for each subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // add each element to sum
                }

                ts++;
                System.out.println(" -> Sum = " + sum);

                // update max and min
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 7, 9, 6};
        Subarrays(numbers);
    }
}