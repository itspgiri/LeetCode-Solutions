class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (c1, c2) -> {
           if (c1[0] == c2[0]) {
               return c1[1] - c2[1];
           } else {
               return c2[0] - c1[0];
           }
        });
        
        List<int[]> res = new ArrayList<>();
        for (int[] person : people) {
            res.add(person[1], person);
        }
        return res.toArray(new int[1][1]);
    }
}