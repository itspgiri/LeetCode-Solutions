class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) {
            return nums;
        }
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[windowEnd]) {
                deque.removeLast();
            }

            deque.add(windowEnd);
            if (windowStart > deque.getFirst()) {
                deque.removeFirst();
            }

            if (windowEnd - windowStart + 1 >= k) {
                result[windowStart] = nums[deque.getFirst()];
                windowStart++;
            }
        }
        return result;
    }
}
