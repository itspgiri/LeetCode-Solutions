class Solution {
    public int kthSmallest(int[][] matrix, int k) {
                return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray()[k - 1];

    }
}