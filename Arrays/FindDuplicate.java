import java.util.*;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        FindDuplicate sol = new FindDuplicate();

        int[] nums = {1, 3, 4, 2, 2};

        int duplicate = sol.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}