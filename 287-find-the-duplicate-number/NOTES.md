### Method 1 - HashSet
Now since, this method requires extra space it's immediately breaching the question.
```
​
class Solution {
public int findDuplicate(int[] nums) {
HashSet<Integer> set = new HashSet<Integer>();
for (int x : nums)
{
if (set.contains(x))
return x;
else
set.add(x);
}
return -1;
}
}
```
​
### Using sorting
Now, in this case we end up modifying our array, again making the question invalid.
```
class Solution {
public int findDuplicate(int[] nums) {
Arrays.sort(nums);
for (int i=1; i<nums.length; i++)
{
if (nums[i-1]==nums[i])
return nums[i];
}
return -1;
}
}
```