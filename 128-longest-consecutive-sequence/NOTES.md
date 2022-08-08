Brute Force Method
```
class Solution {
​
public int longestConsecutive(int[] nums) {
if (nums.length<=0)
return 0;
HashSet<Integer> set = new HashSet<>();
for (int a : nums) set.add(a);
​
int max = Integer.MIN_VALUE;
for (int x : set) {
int c = 0;
while (set.contains(x++)) c++;
max = Math.max(c, max);
}
return max;
}
}
​
```