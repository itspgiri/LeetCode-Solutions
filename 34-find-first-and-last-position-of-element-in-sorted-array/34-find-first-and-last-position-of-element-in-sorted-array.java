class Solution {
   public int[] searchRange(int[] nums, int target) {
        int start=0;
        int[] arr=new int[]{-1,-1};
        int end=nums.length-1;
        int mid=(start+end)/2;
        if(nums.length==0){
            return arr;
        }
        if(nums[start]==target || nums[end]==target){
            if(nums[start]==target){
                arr[0]=start;
                while(start<end && nums[start]==target){
                    if(nums[start+1]==target){
                        start++;
                    }
                    else
                        break;
                }
                arr[1]=start;
            }
            else{
                arr[1]=end;
                while(start<end && nums[end]==target){
                    if(nums[end-1]==target)
                        end--;
                    else
                        break;
                }
                arr[0]=end;
            }
            return arr;
        }
        while(start<mid && mid+1<end && nums[mid]!=target){
            if(nums[mid]>target){
                end=mid;
                
            }
            else
                start=mid;
            mid=(start+end)/2;
        }
        if(nums[mid]==target){
            while(mid>=1 && nums[mid]==target){
                if(nums[mid-1]==target){
                    mid--;
                }
                else
                    break;
            }
            arr[0]=mid;
            mid++;
            while(mid<=end){
                if(nums[mid]==target)
                    mid++;
                else
                    break;
            }
            arr[1]=mid-1;
        }
        
        return arr;
    }

}