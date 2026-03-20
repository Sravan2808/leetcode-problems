class Solution {
    void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void solve(int[] nums,List<List<Integer>> ans,int i){
        if(i==nums.length-1){
            List<Integer> curr = new ArrayList<>();
            for(int num : nums) curr.add(num);
            ans.add(curr);
            return;
        }

        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            solve(nums,ans,i+1);
            swap(nums,i,j);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,ans,0);
        return ans;
    }
}