class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        Map<Pair<Character,Integer>,Integer> mp = new HashMap<>();

        for(int i=0 ; i<n;i++){
            char ch = s.charAt(i);
            int length = 0;
            for(int j=i;j<n;j++){
                if(s.charAt(j) == ch){
                    length++;
                    Pair<Character,Integer> key = new Pair<>(ch,length);
                    mp.put(key,mp.getOrDefault(key,0)+1);
                }else{
                    break;
                }
            }
        }
        int res =-1;
        for(Map.Entry<Pair<Character,Integer>,Integer> entry : mp.entrySet()){
            int length = entry.getKey().getValue();
            if(entry.getValue()>=3 && length>res){
                res = length;
            }
        }
        return res;
    }
}