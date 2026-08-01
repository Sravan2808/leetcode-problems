class Solution {
    private int  solve(int i,int j,int nums[]){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int take_i = nums[i] + Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j = nums[j] + Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int i=0;
        int j=nums.length;
        int total_sum = Arrays.stream(nums).reduce(0,(sum,num)->sum+num);
        int player1 = solve(0,nums.length-1,nums);
        int player2 = total_sum-player1;
        return player1>=player2;
    }
}