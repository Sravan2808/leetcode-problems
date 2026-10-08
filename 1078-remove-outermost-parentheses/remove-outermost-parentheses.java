class Solution {
    public String removeOuterParentheses(String s) {
        int lvl = 0;
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch==')') lvl--;
            if(lvl>0) res.append(ch);
            if(ch=='(') lvl++;
        }
        return res.toString();
    }
}