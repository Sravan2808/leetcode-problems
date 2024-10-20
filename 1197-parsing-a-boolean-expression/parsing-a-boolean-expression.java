class Solution {
    // TC:O(N) SC:O(N)
    void evaluate(Stack<Character> opt,Stack<Character> operand){
        char op = opt.pop();
        boolean ans = true;

        if(op == '|'){
            ans = false;
            while(operand.peek()!='('){
                ans|=(operand.pop()=='t');
            }
            operand.pop();
        }
        else if(op == '&'){
            ans = true;
            while(operand.peek()!='('){
                ans&=(operand.pop()=='t');
            }
            operand.pop();
        }
        else if(op == '!'){
            ans = (operand.pop() == 't');
            ans = !ans;
            operand.pop();
        }
        if(ans){
            operand.push('t');
        }
        else{
            operand.push('f');
        }
    }
    public boolean parseBoolExpr(String expression) {
        Stack<Character> opt = new Stack<>();
        Stack<Character> operand = new Stack<>();
        int idx = 0;
        while(idx<expression.length()){
            char ch = expression.charAt(idx);
            if(ch == '!' || ch == '&' || ch == '|'){
                opt.push(ch);
            }
            else if(ch == 't' || ch == 'f'){
                operand.push(ch);
            }
            else if(ch == '(' ){
                operand.push(ch);
            }
            else if(ch == ')'){
                evaluate(opt,operand);
            }
            idx++;
        }
        return operand.peek() == 't';
    }
}