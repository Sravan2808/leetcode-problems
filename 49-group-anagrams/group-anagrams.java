class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
            return new ArrayList<>(map.values());
    }
}