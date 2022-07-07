class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow =0;
        int[] se = new int[10];
        int[] gu =  new int[10];
        for(int i=0;i<secret.length();i++){
            char sec = secret.charAt(i);
            char gue = guess.charAt(i);
            
            if(sec==gue){
                bull++;
            }else{
                se[sec - '0']++; // "1"-"0"=1 i.e add to character gives an integer
                gu[gue - '0']++;// this sec-0 and gue-0 provide index value and ++ increases the value stored at that index
            }
           
        }
         for(int i=0;i<10;i++){
                cow+=Math.min(se[i],gu[i]);//taking only the value once 
            }
        return bull+"A"+cow+"B";
    }
    
}