This helps us extract the last digit for x when performing x&1
​
**Bitwise Operator XOR (^)**
If they are different it gives 1, or else it gives 0.
​
So implementing the above concept:
```
class Solution {
public int hammingDistance(int x, int y) {
int con = 0;
while(x != 0 || y != 0) //We keep OR so that the looks doesn't fail even if one of them become 0
{
int t = x&1;  //Extracts the last Bit of X
int u = y&1; //Extracts the last Bit of Y
if((t ^ u) == 1)   //XOR returns 1 whenever they are different bits, 0 for same.
con++;                 // Different bit? Increment our counter.
x = x>>1; //Now shifting our value of x to remove the last bit for our next iteration.
y = y>>1; //Now shifting our value of Y to remove the last bit for our next iteration.
}
return con;
}
}
```
​
​