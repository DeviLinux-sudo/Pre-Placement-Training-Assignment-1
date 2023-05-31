public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                result[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            result[i] = 0;
        }

        // Copy the modified array back to nums in-place
        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");  // Output: 1 3 12 0 0
        }
    }
}
