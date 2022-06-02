**Initial Brute Force Method**
Basically going to each index and exchanging the values.
```
//TC is O(R*C) and SC is O(R*C)
class Solution {
public int[][] transpose(int[][] matrix) {
int m=matrix[0].length;
int n=matrix.length;
int matrixT[][] = new int[m][n];
for (int i=0; i<m;i++)
{
for (int j=0; j<n;j++)
{
matrixT[i][j]=matrix[j][i];
}
}
return matrixT;
}
}
```
​