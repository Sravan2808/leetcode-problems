class Solution {
    String[] letterMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private void helper(String digits,String current,List<String> ans,int idx){
        if(idx==digits.length()){
            ans.add(current);
            return;
        }
        int num = digits.charAt(idx)-'0';
        String numStr = letterMap[num];
        for(int i=0;i<numStr.length();i++){
            helper(digits,current+numStr.charAt(i),ans,idx+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        helper(digits,"",ans,0);
        return ans;
    }
}