class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push('(');
            else{
                if(st.isEmpty()) st.push(ch);
                else if(st.peek()==')') st.push(ch);
                if(st.peek()=='(') st.pop(
                    
                );
            }
        }
        return st.size();
    }
}