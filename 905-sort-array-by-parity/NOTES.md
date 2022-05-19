```
class Solution {
public int[] sortArrayByParity(int[] A) {
Integer[] B = new Integer[A.length]; //We make everything in Integer Class
for (int t = 0; t < A.length; ++t)
B[t] = A[t]; //We make Array of Integer Object Type
Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));
for (int t = 0; t < A.length; ++t)
A[t] = B[t];
return A;
​
}
}
```
​
It's one line version:
​
```
class Solution {
public int[] sortArrayByParity(int[] nums) {
return Arrays.stream(nums).boxed().sorted((a,b) -> Integer.compare(a%2, b%2)).mapToInt(i -> i).toArray();
}
}
```
![image](https://assets.leetcode.com/users/images/b91ab99c-38d4-4d86-b3a4-5232b59b581d_1651470908.4267628.jpeg)
​