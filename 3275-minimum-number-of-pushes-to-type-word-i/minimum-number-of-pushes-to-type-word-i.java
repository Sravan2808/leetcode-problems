class Solution {
    public int minimumPushes(String word) {
        Map<Integer,Integer> map = new HashMap<>();
        int key = 2;
        int result=0;
        for(char ch : word.toCharArray()){
            if(key>9) key=2;
            map.put(key,map.getOrDefault(key,0)+1);
            result+=map.get(key);
            key++;
        }
        return result;
    }
}