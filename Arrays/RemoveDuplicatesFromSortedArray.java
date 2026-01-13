import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // index for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution =
                new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
