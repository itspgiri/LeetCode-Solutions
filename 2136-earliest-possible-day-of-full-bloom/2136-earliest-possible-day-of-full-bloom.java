class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        return plantTime != null && growTime != null ? earliestFullBloom(plantTime, growTime, plantTime.length) : 0;
    }

    private int earliestFullBloom(int[] plantTime, int[] growTime, int n) {

        int radix = Arrays.stream(growTime).max().getAsInt();

        int[] A = new int[radix + 1];

        for (int growT : growTime) {
            A[growT]++;
        }

        int[] B = new int[radix + 1];
        int currentSum = 0;

        for (int i = radix; i >= 0; i--) {
            currentSum += A[i];
            B[i] = currentSum;
        }

        int[] sPlant = new int[n];
        int[] sGrow = new int[n];

        for (int i = 0; i < n; i++) {
            sGrow[--B[growTime[i]]] = growTime[i];
            sPlant[B[growTime[i]]] = plantTime[i];
        }

        int totalSum = 0;
        int most = 0;

        for (int i = 0; i < n; i++) {
            totalSum += sPlant[i];
            most = Integer.max(most, sGrow[i] + totalSum);
        }

        return most;
    }
}