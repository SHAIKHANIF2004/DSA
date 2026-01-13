import java.util.Arrays;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int cnt = 0;

        for (int num : nums) {
            if (num == 1) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 0;
            }
        }
        return maxCnt;
    }

   
    public static void main(String[] args) {
        FindMaxConsecutiveOnes solution = new FindMaxConsecutiveOnes();

        int[] nums = {1, 1, 0, 1, 1, 1};

        int result = solution.findMaxConsecutiveOnes(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
