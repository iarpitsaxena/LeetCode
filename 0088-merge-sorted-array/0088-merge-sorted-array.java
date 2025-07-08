class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1copy = new int[m];

        // Copy first m elements of nums1
        for (int i = 0; i < m; i++) {
            nums1copy[i] = nums1[i];
        }

        int p1 = 0;
        int p2 = 0;

        // Merge nums1copy and nums2 into nums1
        for (int p = 0; p < m + n; p++) {
            if (p2 >= n || (p1 < m && nums1copy[p1] < nums2[p2])) {
                nums1[p] = nums1copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
}
