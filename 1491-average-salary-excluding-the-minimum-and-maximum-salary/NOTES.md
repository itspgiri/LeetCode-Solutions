### Method - 1
* Once we iterate to find the MAX and MIN.
* We iterate once again to find average of all elements other than MAX and MIN
* TC: O(N)
```
class Solution {
public double average(int[] salary) {
if (salary.length < 3)
return 0;
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for (int i=0; i<salary.length; i++)
{
if (salary[i]>max)
max = salary[i];
if (salary[i]<min)
min = salary[i];
}
​
int c=0;
double avg=0;
for (int x: salary)
{
if (x!=min && x!=max)
{
c++;
avg = avg + x;
}
}
return avg/c;
}
}
```
​
### Method - 2
* We iterate only once to calculate the MIN and MAX