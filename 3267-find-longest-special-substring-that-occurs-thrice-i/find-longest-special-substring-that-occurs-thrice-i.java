class Solution {
    public int maximumLength(String s) {
        Map<String,Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            StringBuilder curr = new StringBuilder();
            for(int j=i;j<n;j++){
                if(curr.length() == 0 || curr.charAt(curr.length()-1) == s.charAt(j) ){
                    curr.append(s.charAt(j));
                    mp.put(curr.toString(),mp.getOrDefault(curr.toString(),0)+1);
                }
                else{
                    break;
                }
            }
        }
        int result = -1;
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            String st = entry.getKey();
            int cnt = entry.getValue();
            if(cnt >= 3 && st.length()>result){
                result = st.length();
            }
        }
        return result;
        
    }
}