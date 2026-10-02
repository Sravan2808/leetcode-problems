class Solution {
    private void solve(int open,int close,String s,List<String> result,int n){
        if(open>n) return;
        if(open+close==2*n && open==close){
            result.add(s);
            return;
        }
        solve(open+1,close,s+'(',result,n);
        if(open>close) solve(open,close+1,s+')',result,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(0,0,"",result,n);
        return result;
    }
}