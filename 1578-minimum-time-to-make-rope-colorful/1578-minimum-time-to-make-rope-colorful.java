class Solution {
    public int minCost(String colors, int[] neededTime) {
        int lastColorIndex = -1;
        int baloons = colors.length();
        int ans = 0;
     
        for(int baloonIndex=0; baloonIndex<baloons;){
            if(lastColorIndex != -1 && colors.charAt(lastColorIndex) == colors.charAt(baloonIndex)){
                int maxColorTime=neededTime[lastColorIndex];
                int totalColorTime = neededTime[lastColorIndex];
                while(baloonIndex<baloons && colors.charAt(lastColorIndex) == colors.charAt(baloonIndex)){
                   totalColorTime+=neededTime[baloonIndex];
                    maxColorTime = Math.max(maxColorTime,neededTime[baloonIndex]);
                    baloonIndex++;
                }
               
               ans += (totalColorTime - maxColorTime);

            }else{
                lastColorIndex = baloonIndex;
                 baloonIndex++;
            }
        }
        return ans;
    }
}