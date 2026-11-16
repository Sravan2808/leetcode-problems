class Solution {
    public int countConsistent(int[] nums) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            int bitAnd = nums[i];
            int minVal = Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                bitAnd = bitAnd & (nums[j]);
                minVal = Math.min(minVal,nums[j]);
                if(bitAnd == minVal) cnt++;
            }
        }
        return cnt;
    }
}