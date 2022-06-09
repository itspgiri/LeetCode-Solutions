> **UpVote only if you find it useful or of any help. Thank you for reading.**
> Give it a moment for the images to load.
​
## Overview
​
**Approaches**
​
| Method Name |Time Complexity  | Space Complexity |
|--|--|--|
|Brute Force | O(N)^2  | O(1) |
| Two Pointer |O(N)|O(1) |
​
**Brute Force Method:**
```
class Solution {
public int maxSubArray(int[] nums) {
int max=Integer.MIN_VALUE;
for(int i =0;i<nums.length;i++){
int currMax=0;
for(int j = i;j<nums.length;j++){
currMax+=nums[j];
if(currMax>max){
max=currMax;
}
}
}
return max;
}
}
```
​
**Two Pointer 99.22%:**
```
class Solution {
​
public int[] twoSum(int[] n, int t) {
int l = 0;
int r = 1;
while (l < r) {
int s = n[l] + n[r];
if (s == t)
return new int[] { l + 1, r + 1 };
else if (s < t) {
l++;
r++;
}
else if (s > t) {
l--;
}
}
return null;
}
}
​
```
​