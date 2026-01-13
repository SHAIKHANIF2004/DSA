import java.util.*;

class FindMissingAndRepeatingNumbers {

    private int missingNumber(int[] nums, HashSet<Integer> set) {
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public int[] findMissingRepeatingNumbers(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int ans1 = -1; // repeating number

        for (int num : nums) {
            if (set.contains(num)) {
                ans1 = num;
            }
            set.add(num);
        }

        int ans2 = missingNumber(nums, set); // missing number

        res[0] = ans1;
        res[1] = ans2;
        return res;
    }

    public static void main(String[] args) {
        FindMissingAndRepeatingNumbers obj = new FindMissingAndRepeatingNumbers();

        int[] nums = {3, 1, 2, 5, 3};

        int[] result = obj.findMissingRepeatingNumbers(nums);

        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
