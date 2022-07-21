class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int post[] = new int[n];
        pre[0] = nums[0];
        post[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] * pre[i - 1];
        }
        for (int j = n - 2; j >= 0; j--) {
            post[j] = nums[j] * post[j + 1];
        }
        int ans[] = new int[n];
        ans[0] = post[1];
        ans[n - 1] = pre[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = pre[i - 1] * post[i + 1];
        }
        return ans;
    }
}
