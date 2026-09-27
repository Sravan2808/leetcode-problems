class Solution {
    private void reverse(StringBuilder result,int start,int end){
        while(start<=end){
            char temp = result.charAt(start);
            result.setCharAt(start,result.charAt(end));
            result.setCharAt(end,temp);
            start++;end--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='(') st.push(result.length());
            else if (ch==')'){
                int start = st.pop();
                reverse(result,start,result.length()-1);
            }else result.append(ch);
        }
        return result.toString();
    }
}