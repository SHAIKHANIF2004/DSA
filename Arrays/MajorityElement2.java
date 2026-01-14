import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int key : mp.keySet()) {
            if (mp.get(key) > nums.length / 3) {
                list.add(key);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MajorityElement2 sol = new MajorityElement2();

        int[] nums = {1, 2, 3, 1, 1, 2, 2};

        List<Integer> result = sol.majorityElement(nums);

        System.out.println("Majority elements (> n/3): " + result);
    }
}
