public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 with extra 0s at the end
        int m = 3; // Number of elements in nums1
        int[] nums2 = {2, 5, 6}; // nums2
        int n = 3; // Number of elements in nums2

        mergeSortedArray.merge(nums1, m, nums2, n);

        // Print the merged array (nums1)
        for (int num : nums1) {
            System.out.print(num + " "); // Output: 1 2 2 3 5 6
        }
    }
}
