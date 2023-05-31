public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a result array to store the indices of the two numbers
        int[] result = new int[2];
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Search for the complement in the remaining elements of the array
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == complement) {
                    // Set the indices and return the result
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        // If no solution is found, return an empty array
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 0 1
    }
}
