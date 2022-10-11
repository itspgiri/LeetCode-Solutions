class Solution {
    public boolean increasingTriplet(int[] nums) {
       
        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        
        for(int i : nums){
            
            if(i>one){ two=Math.min(two,i); }
            else if(i<one){ one=i; }
            
            if(i>two){ return true; }
            
        }
        return false;
    }
}