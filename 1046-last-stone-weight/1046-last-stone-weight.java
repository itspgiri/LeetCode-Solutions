class Solution {
    public int lastStoneWeight(int[] stones) {
        // priority queue in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> (x<y) ? 1:-1);
        
        for(int stone: stones){
            pq.add(stone);
        }
        
        while(pq.size() > 1){
            int num1 = pq.remove();
            int num2 = pq.remove();
            if(num1 != num2){
                pq.add(num1 - num2);
            }
        }
        
        if(pq.size() == 1){
            return pq.peek();
        } else {
            return 0;
        }
        
    }
}