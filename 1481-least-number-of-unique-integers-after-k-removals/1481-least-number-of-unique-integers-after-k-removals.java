class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int l=hm.size();               
         int r[]=new int[l]; 
        int j=0;
         for (Map.Entry<Integer, Integer> entry : hm.entrySet())
             r[j++]=entry.getValue(); 
     
        
        Arrays.sort(r);        
        int o=0;
        while(k!=0){
            if(r[o]!=0){
                r[o]=r[o]-1;
            }
            if(r[o]==0){
                o++;
            }
            k--;
        }
        int count=0;
        for(int i=0;i<r.length;i++){
            if(r[i]!=0){
                count++;
            }
        }
        return count;
    }
}