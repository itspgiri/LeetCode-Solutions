## Brute Force
Which goes TLE like most O(N)2 solution of LC.
```
class Solution {
public int maxProfit(int[] prices) {
int res = Integer.MIN_VALUE;
for (int i=0; i<prices.length; i++)
{
for (int j=i+1; j<prices.length; j++)
{
res = Math.max(res, prices[j]-prices[i]);
}
}
if (res<0)
res=0;
return res;
}
}
```