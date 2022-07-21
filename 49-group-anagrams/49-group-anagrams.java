class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> m = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c) ;
            String temp = String.valueOf(c);
            if(m.containsKey(temp))
            {
                List<String> list = m.get(temp);
                list.add(strs[i]);
                m.put(temp,list);
            }
            else
            { 
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                m.put(temp, list);
            }            
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(m.values());
        return ans;
    }
}