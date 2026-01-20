class Solution {
    int cal(char operation, int x, int y) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
        }
        return 0;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                int value =Integer.parseInt(tokens[i]);
                st.push(value);
            } else {
                int x = st.pop();
                int y = st.pop();
                int value = cal(tokens[i].charAt(0), y, x);
                st.push(value);
            }

        }
        return st.peek();

    }
}