class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int ans = 0;
        if(nums[0]>=nums[1]) ans+=1;
        if(nums[n-1]>=nums[n-2]) ans+=1;
        for(int i=1;i<n-1;i++){
            int val = 0;
            val = (nums[i-1]+nums[i+1]);
            if(2*nums[i]>=val) ans+=1;
        }
        return ans;
    }
}