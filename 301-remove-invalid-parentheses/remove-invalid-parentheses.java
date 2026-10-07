class Solution {
    private Set<String> st = new HashSet<>();
    private int n;
    private int maxLen;

    private void solve(String s, int i, StringBuilder curr, int count) {
        if (count < 0)
            return;

        if (i == n) {
            if (count == 0) {
                if (curr.length() > maxLen) {
                    maxLen = curr.length();
                    st.clear();
                }
                if (curr.length() == maxLen)
                    st.add(curr.toString());
            }
            return;
        }
        char ch = s.charAt(i);
        if (ch != '(' && ch != ')') {
            curr.append(ch);
            solve(s, i + 1, curr, count);
            curr.deleteCharAt(curr.length() - 1);
            return;
        }

        // Take
        curr.append(ch);

        // Explore
        solve(s, i + 1, curr, count + (ch == '(' ? 1 : -1));

        // Not Take
        curr.deleteCharAt(curr.length() - 1);
        solve(s, i + 1, curr, count);

    }

    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        maxLen = 0;
        solve(s, 0, new StringBuilder(), 0);

        return new ArrayList<>(st);
    }
}