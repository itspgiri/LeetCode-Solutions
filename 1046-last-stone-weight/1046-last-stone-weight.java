class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        
        for (int stone : stones)
            heap.add(stone);
        
        while(heap.size() > 1){
            int val1 = heap.poll();
            int val2 = heap.poll();
            
            if(val1 > val2)
                heap.offer(val1-val2);
            else if (val1 < val2)
                heap.offer(val2-val1);
                
        }
        
        if (heap.size() == 0)
            return 0;
        return heap.poll();
    }
}
