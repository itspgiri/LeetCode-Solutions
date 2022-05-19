class Solution {
    public int[][] generateMatrix(int n) {
       int[][] ans = new int[n][n];
        int c=1;
        int left=0,right=n-1,top=0,bottom=n-1;
        while(left<=right && top<=bottom)
        {
            for(int i=top;i<=bottom;i++)
            {
                ans[left][i]=c++;
            }
            left++;
            for(int i=left;i<=right;i++)
            {
                ans[i][bottom]=c++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                ans[right][i]=c++;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                ans[i][top]=c++;
            }
            top++;
        }
        return ans;
    }
}