class Solution {
    public int minMoves(int[] nums) {
        int maxi = nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++) maxi = Math.max(maxi,nums[i]);
        int moves = 0;
        for(int i=0;i<n;i++) moves+=Math.abs(nums[i]-maxi);

        return moves;
    }
}