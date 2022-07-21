class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
        for (String s : strs) {
            char sa[] = s.toCharArray();
            Arrays.sort(sa);
            String x = Arrays.toString(sa);
            ArrayList<String> al = m.getOrDefault(x, new ArrayList<String>());
            al.add(s);
            m.put(x, al);
        }
        return new ArrayList(m.values());
    }
}
