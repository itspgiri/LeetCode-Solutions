class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, WordFrequency> map = new HashMap();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, new WordFrequency(word, 0));
            }
            ++map.get(word).count;
        }
        
        PriorityQueue<WordFrequency> pq = new PriorityQueue(k+1);
        for (WordFrequency wf : map.values()) {
            pq.add(wf);
            if (pq.size()>k) {
                pq.poll();
            }
        }
        
        LinkedList<String> res = new LinkedList();
        while (!pq.isEmpty()) {
            res.addFirst(pq.poll().word);
        }
        
        return res;
    }
}

class WordFrequency implements Comparable<WordFrequency> {
    String word;
    int count;
    
    public WordFrequency(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    @Override
    public int compareTo(WordFrequency that) {
        int diff = this.count - that.count;
        
        return (diff != 0) ? diff : that.word.compareTo(this.word);
    }
}