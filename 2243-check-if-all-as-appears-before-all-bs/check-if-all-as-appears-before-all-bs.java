class Solution {
    public boolean checkString(String s) {
        int set[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set[(ch-'a')+1]==1 && s.charAt(i)=='a') return false;
            set[ch-'a'] = 1;
        }
        return true;
    }
}