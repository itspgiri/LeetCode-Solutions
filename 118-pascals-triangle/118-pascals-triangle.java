class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++) {
            Integer[] row = new Integer[i + 1];
            row[0] = 1;
            row[i] = 1;
            if(i > 0) {
                List<Integer> previousRow = result.get(i - 1);
                for(int j = 1; j < row.length - 1; j++) {
                    row[j] = previousRow.get(j - 1) + previousRow.get(j);
                }
            }
            result.add(Arrays.asList(row));
        }
        
        return result;
    }
}