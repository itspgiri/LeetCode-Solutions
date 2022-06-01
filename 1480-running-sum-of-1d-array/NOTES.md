**Approach**
- Using same array to store result to make space complexity from O(N) to O(1)
- Updating the values of nums as the value of sum gets updated.
​
**Code**
```
​
class Solution {
public int[] runningSum(int[] nums) {
int sum = 0;
for (int i=0; i<nums.length; ++i)
{
sum += nums[i];
nums[i] = sum;
}
return nums;
}
}
​
```
​
**Side Points:**
- Always see do we really need a new array to store our result into? Usually we can store our results in the same input array, if the the input array is not required after a point.
- Using ++i instead of i++ since this results into faster run time. When we do [(More Details here)](https://iq.opengenus.org/postfix-vs-prefix-increment-java/)
- Also performing sum += nums[i] instead of sum = sum + nums[i]. (More details here: [Link 1](https://stackoverflow.com/questions/57132337/difference-between-string-s1-and-string-string-s1) and [Link 2](https://www.linkedin.com/feed/update/urn:li:activity:6901511939856433152/))
- In this case I didn't store nums.length in a different variable but if you plan to use the value more than once, it's better for coding readabilty purpose to store it in a variable.
​
> Thank you for reading, upvote if you find anything useful. Please do comment if you have some feedback or points.