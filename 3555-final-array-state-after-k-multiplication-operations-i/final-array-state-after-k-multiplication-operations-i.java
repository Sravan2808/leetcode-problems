class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0;j<k;j++){
            int idx = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<nums[idx]){
                    idx = i;
                }
            }
            nums[idx]*=multiplier;
        }
        return nums;
    }
}