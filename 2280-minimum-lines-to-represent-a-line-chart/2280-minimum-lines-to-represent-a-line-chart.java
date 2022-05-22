class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 1) 
            return 0;
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 2; i < stockPrices.length; i++) {

            if ((stockPrices[i][1] - stockPrices[i - 1][1]) * (stockPrices[i - 1][0] - stockPrices[i - 2][0]) == 
                (stockPrices[i - 1][1] - stockPrices[i - 2][1]) * (stockPrices[i][0] - stockPrices[i - 1][0])) 
                continue;
            
            count++;;
        }
        return count;
    }
}