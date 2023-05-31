import java.util.Arrays;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }

        // Check if the missing number is at the beginning or end
        if (nums[n - 1] != n) {
            missing = n;
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }

    public static void main(String[] args) {
        FindErrorNums findErrorNums = new FindErrorNums();
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums.findErrorNums(nums);
        System.out.println("Duplicate: " + result[0]);  // Output: 2
        System.out.println("Missing: " + result[1]);    // Output: 3
    }
}
