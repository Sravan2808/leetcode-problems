class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0,j=0;
        int maxBeauty = 0;
        while(i<n){
            while(j<n && nums[j]<=nums[i]+2*k){
                j++;
            }
            maxBeauty = Math.max(maxBeauty,j-i);
            i++;
        }
        return maxBeauty;
    }
}