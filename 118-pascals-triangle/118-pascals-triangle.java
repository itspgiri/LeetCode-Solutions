class Solution {
    public List<List<Integer>> generate(int nR) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nR; i++) {
            Integer[] r = new Integer[i + 1];
            r[0] = 1;
            r[i] = 1;
            if(i > 0) {
                List<Integer> pR = result.get(i - 1);
                for(int j = 1; j < r.length - 1; j++) {
                    r[j] = pR.get(j - 1) + pR.get(j);
                }
            }
            result.add(Arrays.asList(r));
        }
        
        return result;
    }
}