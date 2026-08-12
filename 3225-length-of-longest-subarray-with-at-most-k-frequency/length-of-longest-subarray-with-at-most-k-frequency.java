class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int i=0;
        int j=0;
        int result = 0;
        int n = nums.length;

        while(j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);

            while(i<j && mp.get(nums[j])>k){
                int value = mp.get(nums[i]);
                mp.put(nums[i],value-1);
                i++;
            }
            result = Math.max(result,j-i+1);
            j++;
        }
        return result;
    }
}