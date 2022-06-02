{
if (nums[i-1]==nums[i])
return nums[i];
}
return -1;
}
}
```
​
## Method 3 - O(N)^2
Now, this satisfies the question but then hits the TLE Wall.
```
class Solution {
​
public int findDuplicate(int[] nums) {
for (int i = 0; i < nums.length; i++) {
for (int j = i + 1; j < nums.length; j++) {
if (nums[i] == nums[j]) return nums[i];
}
}
return -1;
}
}
```
​