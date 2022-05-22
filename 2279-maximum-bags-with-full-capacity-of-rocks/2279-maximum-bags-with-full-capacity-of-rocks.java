class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //You don't need the def array, you can just store results in the capacity array only.
        int def[] = new int[capacity.length];
        int c = 0;
        for (int i=0; i<capacity.length; i++)
        {
            def[i] = capacity[i] - rocks[i];

        }
        Arrays.sort(def);
        for (int x : def)
        {
            if (additionalRocks<x)
            break;
            //So we break when there is no way the next bag will be fully filled by rocks
            //REMEMBER We are supposed to return ONLY the count of FULL BAGS. Completely full.
            //Remember you also sorted the Bag so there is no way, there is going to be a bad ahead with less campacity.
            additionalRocks = additionalRocks - x;
            c++;
        }
        return c;
    }
}