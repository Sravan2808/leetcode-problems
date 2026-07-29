class Solution {
    private void solve(int idx,int nums[],List<List<Integer>> ans,List<Integer> list,int target){
        if(target==0){
            ans.add(new ArrayList(list));
            return;
        }
        if(target<0 || idx==nums.length) return;

        // Take
        list.add(nums[idx]);
        solve(idx+1,nums,ans,list,target-nums[idx]);
        list.remove(list.size()-1);

        // Not Take
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]!=nums[idx]){
                solve(i,nums,ans,list,target);
                break;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,ans,list,target);
        return ans;
    }
}