class Solution {
    public String smallestPalindrome(String s) {
        // Map<Character,Integer> map = new TreeMap<>();
        // for(char ch:s.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }

        // StringBuilder str = new StringBuilder();
        // char mid = ' ';
        // boolean found = false;
        // for(char c:map.keySet()){
        //     int freq = map.get(c);
        //     for(int i=0;i<freq/2;i++){
        //         str.append(c);
        //     }
        //     if(freq%2!=0){
        //         mid=c;
        //         found = true;
        //     }
        // }

        // String reversed = new StringBuilder(str).reverse().toString();

        // if(found) str.append(mid);

        // str.append(reversed);

        // return str.toString();

        char half[] = s.substring(0, s.length() / 2).toCharArray();
        Arrays.sort(half);

        String res = new String(half) + ((s.length() & 1) == 1 ? s.charAt(s.length() / 2) : "") +
                new StringBuilder(new String(half)).reverse();

        return res;

    }
}