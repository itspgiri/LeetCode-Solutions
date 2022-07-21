class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        //We created a map of the frequency of every single element
        
        //We are basically making a TreeMap of all the numbers with same frequency
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        //We create a TreeMap, where the Key is the frequency
        for(int num : map.keySet()){
           int freq = map.get(num);
           if(!freqMap.containsKey(freq)){
               freqMap.put(freq, new LinkedList<>());
           }
           freqMap.get(freq).add(num);
        }
        
        //Now we create a result ArrayList to get the top K frequent elements
        List<Integer> res = new ArrayList<>();
        
        //We will iterate from the back and keep ading the numbers to res till we get the K elements
        while(res.size()<k){
            
            //We are creating an entry to our FrequencyMap - TreeMap for the last Entry that it contains
            //The last entry will have the max frequency right? Obviously.
            //So we get the entry to that element
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            
            //Now we are adding all the numbers that are at that particular frequency.
            res.addAll(entry.getValue());
        }
        
        //We have to convert it to array since the function requires so.
        int[] res1 = res.stream().mapToInt(Integer::intValue).toArray();
        return res1;
    }
}