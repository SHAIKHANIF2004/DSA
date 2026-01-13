import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algorithm
        int ele = 0;
        int cnt = 0;

        for (int num : nums) {
            if (cnt == 0) {
                ele = num;
            }
            if (ele == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;
    }

  
    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Majority Element: " + solution.majorityElement(nums));
    }
}
