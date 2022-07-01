class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
    int res = 0;

    for(int box[] : boxTypes){
        int curr = Math.min(truckSize, box[0]);
        res += curr * box[1];
        if((truckSize -= curr) == 0)
            return res;
    }
    return res;
}
}