class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> list= new ArrayList<>();
        list.add(1);
        result.add(list);
        
        if(numRows==1) {
            return result;
        }
        
        List<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(1);
        result.add(list2);
        
        if(numRows==2) {
            return result;
        }
        
        for(int i=3; i<=numRows; i++) {
            List<Integer> temp= result.get(i-2);
            List<Integer> temp2= new ArrayList<>();
            int k=0;
            for(int j=0; j<temp.size(); j++) {
                temp2.add(k+temp.get(j));
                k=temp.get(j);
            }
            temp2.add(1);
            result.add(temp2);
        }
        return result;
    }
    
}