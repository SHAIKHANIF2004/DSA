import java.util.Arrays;

public class SortColors  {

    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // Dutch National Flag Algorithm
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, right);
                right--;
            }
        }
    }

    
    public static void main(String[] args) {
        SortColors solution = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(nums));
        solution.sortColors(nums);
        System.out.println("After sorting:  " + Arrays.toString(nums));
    }
}
