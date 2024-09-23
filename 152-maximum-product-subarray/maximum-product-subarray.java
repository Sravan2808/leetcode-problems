class Solution {
    public int maxProduct(int[] nums) {
        // Better Aprroach TC:O(n^2)
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int product =1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                maxi = Math.max(maxi,product);
            }
        }
        return maxi;
        
    }
}