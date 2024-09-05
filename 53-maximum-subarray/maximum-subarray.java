class Solution {
    public int maxSubArray(int[] nums) {
        // Brute Force =>TC:O(n^2),SC:O(1)

        // int maxLength=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        // int sum=0;
        // for(int j=i;j<nums.length;j++){
        // sum+=nums[j];
        // maxLength=Math.max(sum,maxLength);
        // }
        // }
        // return maxLength;

        // KADANE'S ALGORITHM(Optimal Soln's)
        int maxLength = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxLength = Math.max(maxLength, sum);
            if (sum < 0)
                sum = 0;
        }

        return maxLength;

    }
}