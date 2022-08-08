My Method:
```
class Solution {
​
public static String convertString(String s) {
String res = "";
s = s.toLowerCase();
for (char a : s.toCharArray()) {
if (a >= 'a' && a <= 'z' || a>='0' && a<='9') res = res + a;
}
return res;
}
​
public boolean isPalindrome(String s) {
s = convertString(s);
String pal = "";
​
for (char a : s.toCharArray())
pal = a + pal;
​
if (s.equals(pal))
return true;
else
return false;
}
}
​
```
NeetCode Method:
```
public boolean isPalindrome(String s) {
int i = 0;
int j = s.length() - 1;
while (i < j) {
Character start = s.charAt(i);
Character end = s.charAt(j);
if (!Character.isLetterOrDigit(start)) {
i++;
continue;
}
if (!Character.isLetterOrDigit(end)) {
j--;
continue;
}