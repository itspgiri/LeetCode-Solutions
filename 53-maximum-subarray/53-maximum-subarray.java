class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<nums.length;i++){
        
        sum+=nums[i];
        sum=Math.max(sum,nums[i]);
        maxSum=Math.max(sum,maxSum);
          
    }
    //System.out.println(maxSum);
    return maxSum;
    }
}