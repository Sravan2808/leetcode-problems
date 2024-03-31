class Solution {
    public void backtrack(int idx,List<List<Integer>> result,ArrayList<Integer> currList,int nums[])
    {
        result.add(new ArrayList(currList));
        for(int i=idx;i<nums.length;i++)
        {
            //added current element in the result
            currList.add(nums[i]);
            // generate further
            backtrack(i+1,result,currList,nums);
            // once all exploration remove the last element
            currList.remove(currList.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currList = new ArrayList<>();
        backtrack(0,result,currList,nums);
        return result;
        
    }
}