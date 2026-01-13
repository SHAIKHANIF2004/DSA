import java.util.Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    
    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums));
    }
}
