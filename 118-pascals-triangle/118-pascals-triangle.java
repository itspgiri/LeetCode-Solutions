class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
		if(n==0) 
        {
			return new ArrayList<>();
		}
		
		for(int i=1;i<=n;i++) {
			List<Integer> row = new ArrayList<>();
			for(int j=0;j<i;j++) {
				if(j==0 || j==i-1) 
                {
					row.add(1);  
                    // as 1 is present at the beginning and  ending of each row 
				}
				else {
					int sum = ans.get(i-2).get(j) + ans.get(i-2).get(j-1); // this is the sum we got from the above row 											by adding jth index and (j-1)th index
					row.add(sum);
				}
			}
			ans.add(row);
		}
		return ans;
    }
}