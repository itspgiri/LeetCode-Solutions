Solution O(N)
```
class Solution {
​
public boolean isAnagram(String s, String t) {
int as[] = new int[26];
for (char a : s.toCharArray()) {
as[a - 'a'] += 1;
}
int at[] = new int[26];
for (char a : t.toCharArray()) {
at[a - 'a'] += 1;
}
for (int i = 0; i < 26; i++) {
if (as[i] != at[i]) return false;
}
return true;
}
}
​
```
​
Solution O(NlogN)
```
class Solution {
public boolean isAnagram(String s, String t) {
if (s.length() != t.length())
return false;
char a_s[] = s.toCharArray();
char a_t[] = t.toCharArray();
Arrays.sort(a_s);
Arrays.sort(a_t);
s = Arrays.toString(a_s);
t = Arrays.toString(a_t);
if (s.equals(t))
return true;
return false;
}
}
```