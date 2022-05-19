class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
int [] arr = new int [nums.length+1];
        arr[0]=-1;
        for(int x : nums)
        {
            arr[x]++;
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
                ans.add(i);
        }
        
        return ans;
    }
}