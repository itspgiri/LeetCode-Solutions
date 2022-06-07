class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m + n];
        int a = 0;
        int b = 0;
        for (int i = 0; i < res.length; i++) {
            if (a < m && b < n) {
                if (nums1[a] <= nums2[b]) {
                    res[i] = nums1[a];
                    a++;
                } else {
                    res[i] = nums2[b];
                    b++;
                }
            } else if (a >= m && b < n) {
                res[i] = nums2[b];
                b++;
            } else if (a < m && b >= n) {
                res[i] = nums1[a];
                a++;
            }
        }
        for (int i = 0; i < nums1.length; i++) nums1[i] = res[i];
    }
}
