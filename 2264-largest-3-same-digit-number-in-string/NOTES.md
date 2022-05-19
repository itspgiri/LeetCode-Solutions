return largest;
}
}
```
## Method 2
![image](https://assets.leetcode.com/users/images/2e214b50-7476-418f-bcc6-ae91b0c1d54f_1652105600.0236483.jpeg)
```
class Solution {
public String largestGoodInteger(String num) {
StringBuilder toFind = new StringBuilder("999");
for (int i = 10; i > 0; i--)
{
if (num.indexOf(toFind.toString()) != -1)
return toFind.toString();
for (int j = 0; j < 3; j++)
toFind.setCharAt(j, (char) (toFind.charAt(j) - 1));
}
return "";
}
}
```
Referenced/Solutions for 999-000:
* https://leetcode.com/problems/largest-3-same-digit-number-in-string/discuss/2019973/Easy-JAVA-C%2B%2B-Solutions-beat-100-
​