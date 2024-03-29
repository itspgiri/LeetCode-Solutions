### Method 1
![](https://i.ibb.co/QbdS2M5/Whats-App-Image-2022-05-22-at-1-37-00-PM.jpg)
It's important to sort. We sort because we are comparing the slope of the points with the the points before it and after it. If we sort the points, we put similar slopes together with this method.

It's cleaner easier to understand if we store the values in seperate Data Types.

```
class Solution {
    public int minimumLines(int[][] stockPrices) {
        if (stockPrices.length == 1) 
            return 0;
        Arrays.sort(stockPrices, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 2; i < stockPrices.length; i++) {
            //AVOID DIVINDING AT ALL CASES BASICALLY IS A KEY LEARNING OF THIS QUESTION
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
```

NOTE: If we do using calculating each slope and then comparing, it usually involves divison and this adds a lot of complications.

We can't use Integer. We have to use something like decimal, even decimal doesn't work due it it's lack of size so we have to use BigDecimal.

## Method 2 - BigDecimal
Without Cross-Multiplication and using formula based division.
```
import java.math.BigDecimal;
class Solution {
    public int minimumLines(int[][] stockPrices) {
int n = stockPrices.length,lines=1;
        if(n<3) return n-1;
        Arrays.sort(stockPrices, Comparator.comparingInt(a -> a[0]));
        for(int i=1;i<n-1;i++){
            BigDecimal x1 = BigDecimal.valueOf(stockPrices[i-1][0]), x2 = BigDecimal.valueOf(stockPrices[i][0]), x3 = BigDecimal.valueOf(stockPrices[i+1][0]);
            BigDecimal y1 = BigDecimal.valueOf(stockPrices[i-1][1]), y2 = BigDecimal.valueOf(stockPrices[i][1]), y3 = BigDecimal.valueOf(stockPrices[i+1][1]);
            BigDecimal d1 = (x2.subtract(x1)).multiply(y3.subtract(y2));
            BigDecimal d2 = (y2.subtract(y1)).multiply(x3.subtract(x2));
            if(!d1.equals(d2)) lines++;
        }
        return lines;
    }
}
```