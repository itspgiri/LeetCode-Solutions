So, I initially went through some brute-force methods but began to search for more alternates to learn how to do it in an optimised manner, came across Kadane's Algorithm.
​
Now, there are some key points:
​
1. The minimum max value is going to be nums[0] so we can directly keep it that, we don't need to do int MAX = Integer.MAX_VALUE
​
2. We can reduce the question to a O(nums.length) complexity.
​
3. We can prevent it from re-checking previously already calculate sum (As in the case of using two for loops as suggested by others)
​
So we do something like this:
```
class Solution {
public int maxSubArray(int[] nums) {
int max_sum = nums[0]; //Cause this is the minimum possible sum we can have
int current_sum = max_sum;
for (int i = 1; i<nums.length; i++) {
current_sum = Math.max(nums[i]+current_sum, nums[i]);
max_sum = Math.max(current_sum, max_sum);
}
return max_sum;
}
}
```
​
Now, there are clearly some solutions which are faster than this, would love to hear how this can be further optimised.