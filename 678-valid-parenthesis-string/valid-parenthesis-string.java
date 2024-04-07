class Solution {
    public boolean checkValidString(String s) {
         Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push(i);
            } else if(s.charAt(i) == '*') {
                star.push(i);
            } else if(s.charAt(i) == ')') {
                if(!st.isEmpty()){
                    st.pop();
                } else if(!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while(!st.isEmpty() && !star.isEmpty()) {
            int openIndex = st.pop();
            int starIndex = star.pop();
            if(openIndex > starIndex) {
                return false;
            }
        }

        return st.isEmpty();

        
    }
}