public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[100000];

        for (int i = 0; i < n; i++) {
            if (visited[nums[i]]) {
                return true;
            }
            visited[nums[i]] = true;
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 1, 4, 2};
        boolean hasDuplicate = containsDuplicate.containsDuplicate(nums);
        System.out.println(hasDuplicate);  // Output: false
    }
}
