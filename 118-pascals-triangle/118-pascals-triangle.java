class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> curLine = new ArrayList<>();
        curLine.add(1);
        result.add(curLine);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevLine = result.get(result.size() - 1);
            curLine = new ArrayList<>();
            for (int j = 0; j < prevLine.size(); j++) {
                if (j == 0) {
                    curLine.add(1);
                } else {
                    curLine.add(prevLine.get(j) + prevLine.get(j - 1));
                } 
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}