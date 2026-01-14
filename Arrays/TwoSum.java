import java.util.*;

class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int rem = target - val;

            if (mp.containsKey(rem)) {
                res[0] = mp.get(rem);
                res[1] = i;
                break;
            }
            mp.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}