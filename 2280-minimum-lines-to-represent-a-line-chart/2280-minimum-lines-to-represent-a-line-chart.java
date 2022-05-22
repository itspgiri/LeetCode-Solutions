class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 1) 
            return 0;
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 2; i < stockPrices.length; i++) {
            //AVOID DIVINDING AT ALL CASES BASICALLY
            int x1 = stockPrices[i-2][0];
            int x2 = stockPrices[i-1][0];
            int x3 = stockPrices[i][0];
            int y1 = stockPrices[i-2][1];
            int y2 = stockPrices[i-1][1];
            int y3 = stockPrices[i][1];
            if ((y3-y2) * (x2-x1) == (y2-y1)*(x3-x2))
                continue;
            count++;;
        }
        return count;
    }
}