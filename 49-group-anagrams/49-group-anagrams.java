class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> m = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c) ;
            String t = String.valueOf(c);
            if(m.containsKey(t))
            {
                List<String> l = m.get(t);
                l.add(strs[i]);
                m.put(t,l);
            }
            else
            { 
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                m.put(t, l);
            }            
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(m.values());
        return ans;
    }
}