class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=-1;
        result[1]=-1;
        
        if(nums.length==1 && nums[0]==target){
            result[0]=0;
            result[1]=0;
            return result;
        }
        Set<Integer> st=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(!st.contains(nums[i])){
                     result[0]=i;
                     result[1]=i;
                     st.add(nums[i]);
                }else{
                    result[1]=i;
                }
            }
        }
       
        return result;
    }
}
