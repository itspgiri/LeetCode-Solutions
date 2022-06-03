class Solution {
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0 ; i < numRows ; i++){
          
         List<Integer> row = new ArrayList<>();
          if(i == 0){
            row.add(1);
          }
          else if(i == 1){
            row.add(1);
            row.add(1);
          }
          else{
            List<Integer> prevRow = res.get(res.size()-1);
            row.add(1);  //first element of your row
            for(int x = 0;x < prevRow.size()-1 ; x++){
                 row.add(prevRow.get(x)+prevRow.get(x+1));
            }
            row.add(1); //last element of your row
          }
          res.add(row);
          
        }
      return res;
    }
}