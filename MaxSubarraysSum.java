public class MaxSubarraysSum {
    public static void MaxSum(int numbers[]) {
        int ts = 0; // total subarrays
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // Calculate Prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Generate subarrays
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                int curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                ts++; // count subarray

                // update max and min
                if (curr_sum > maxSum) {
                    maxSum = curr_sum;
                }
                if (curr_sum < minSum) {
                    minSum = curr_sum;
                }
            }
        }

        System.out.println("Total Subarrays = " + ts);
        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 7, 9, 6};
        MaxSum(numbers);
    }
}
