class Solution {
    private void solve(int i,List<List<Integer>> ans,List<Integer> list,int[] num,int sum){
        if(sum==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum<0 || i==num.length) return;

        // Take
        list.add(num[i]);
        solve(i,ans,list,num,sum-num[i]);
        list.remove(list.size()-1);

        // Not Take
        solve(i+1,ans,list,num,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0,ans,list,candidates,target);
        return ans;
    }
}