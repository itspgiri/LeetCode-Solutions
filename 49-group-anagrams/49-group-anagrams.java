class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String x : strs) {
            char cr[] = x.toCharArray();
            Arrays.sort(cr);
            String s = Arrays.toString(cr);
            if (map.containsKey(s)) {
                List<String> child = map.get(s);
                child.add(x);
                map.put(s, child);
            } else {
                List<String> child = new ArrayList<String>();
                child.add(x);
                map.put(s, child);
            }
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        Iterator<String> it = map.keySet().iterator(); //keyset is a method
        while (it.hasNext()) {
            String key = it.next();
            ans.add(map.get(key));
        }
        return ans;
    }
}
