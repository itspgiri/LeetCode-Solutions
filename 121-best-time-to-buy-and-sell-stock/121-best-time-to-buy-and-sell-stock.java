class Solution {
    public int maxProfit(int[] prices) {
     int lowest_buy_price = Integer.MAX_VALUE;
    int max_selling_price = 0;
        for (int i=0; i<prices.length; i++)
        {
            if (prices[i] < lowest_buy_price)
                lowest_buy_price = prices[i];
            
            int sell_today = prices[i]-lowest_buy_price;
            max_selling_price = Math.max(sell_today, max_selling_price);
        }
        return max_selling_price;
    }
}