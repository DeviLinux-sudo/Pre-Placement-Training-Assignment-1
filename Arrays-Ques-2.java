public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Count of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int count = removeElement.removeElement(nums, val);
        System.out.println("Count: " + count); // Output: 2
        
        // Print the updated array (first k elements)
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " "); // Output: 2 2
        }
    }
}
