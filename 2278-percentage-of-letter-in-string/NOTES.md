### Simple Percentage Calculator:
​
I multiplied the count with 100 in advance because otherwise when we do count / length of string it gives an answer in 0.x which gets converted to 0.
​
```
class Solution {
public int percentageLetter(String s, char letter) {
int c = 0;
int n = s.length();
for (int i=0; i<n; i++){
if (s.charAt(i) == letter)
c++;
}
int ans = 100 * c / n;
return n;
}
}
```