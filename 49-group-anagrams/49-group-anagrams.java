class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String s : strs) {
            char s_arr[] = s.toCharArray();
            Arrays.sort(s_arr);
            String x = Arrays.toString(s_arr);
            ArrayList<String> al = map.getOrDefault(x, new ArrayList<String>());
            al.add(s);
            map.put(x, al);
        }
        return new ArrayList(map.values());
    }
}
