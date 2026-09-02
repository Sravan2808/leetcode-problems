class Solution {
    private int palindrome(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0,end=0;
        for(int i=0;i<n;i++){
            int odd = palindrome(s,i,i);
            int even = palindrome(s,i,i+1);
            int length = Math.max(even,odd);
            
            if(length>(end-start)){
                start = i-(length-1)/2;
                end = i+(length)/2;
            }
        }
        return s.substring(start,end+1);
    }
}