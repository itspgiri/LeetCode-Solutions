It's basically optimising the postive negative one into 0/1s
So if a number is never found their index stays O, while those found keep incrementing to other values
```
​
class Solution {
public List<Integer> findDisappearedNumbers(int[] nums) {
int [] arr = new int [nums.length+1];
arr[0]=-1; //Since we will be storing index values and let's say we get a number such as zero, even though the limtiations don't allow
for(int x : nums)
{
arr[x]++; //Basically finding the index of the nums[x] and incrementing the value in arr[x] for that index.
}
ArrayList<Integer> ans = new ArrayList<Integer>();
for(int i=1;i<arr.length;i++)
{
if(arr[i]==0)
ans.add(i); //Finding all those missing.
}
return ans;
}
}
```
​
Thank you.
​