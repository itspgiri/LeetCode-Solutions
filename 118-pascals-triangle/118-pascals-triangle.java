class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        if(numRows==1)
        {   List<Integer> temp=new ArrayList<>();
           temp.add(1);
            ans.add(temp);
            return ans;
        }
        List<Integer> one=new ArrayList<>();
           one.add(1);
            ans.add(one);
        for(int i=1;i<numRows;i++)
        {
             List<Integer> temp=new ArrayList<>(i+1);
           
              temp.add(1);
              
               for(int j=1;j<i;j++)
               {
                   int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                   temp.add(val);
               }
            temp.add(1);
            ans.add(temp);
            
        }
        return ans;
        
    }
}