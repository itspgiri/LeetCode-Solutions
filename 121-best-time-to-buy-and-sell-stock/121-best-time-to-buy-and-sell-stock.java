class Solution {
    public int maxProfit(int[] prices) {
        int curr_sell_val = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            curr_sell_val = Math.max(0, curr_sell_val += prices[i] - prices[i-1]);
            maxSoFar = Math.max(curr_sell_val, maxSoFar);
        }
        return maxSoFar;
    }
}
// *maxCur = current maximum value
// *maxSoFar = maximum value found so far