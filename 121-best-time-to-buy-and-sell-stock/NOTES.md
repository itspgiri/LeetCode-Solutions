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
​
## Method 1  - Similar to Kadane but more readable
We basically are re-calculating our values
```
class Solution {
public int maxProfit(int[] prices) {
int lowest_buy_price = Integer.MAX_VALUE;
int max_proft = 0;
for (int i=0; i<prices.length; i++)
{
if (prices[i] < lowest_buy_price)
lowest_buy_price = prices[i];
int sell_today = prices[i]-lowest_buy_price;
max_proft = Math.max(sell_today, max_proft);
}
return max_proft;
}
}
```