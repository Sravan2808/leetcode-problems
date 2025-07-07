class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(0,res,ans,nums);
        return res;
    }
    public void backtrack(int idx ,List<List<Integer>> res,List<Integer> ans,int[] nums){
        if(idx == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        backtrack(idx+1,res,ans,nums);
        ans.remove(ans.size()-1);
        backtrack(idx+1,res,ans,nums);
    }
}