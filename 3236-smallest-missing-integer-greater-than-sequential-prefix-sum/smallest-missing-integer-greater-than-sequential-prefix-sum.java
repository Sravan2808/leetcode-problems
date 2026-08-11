class Solution {
    public int missingInteger(int[] nums) {
        int seqSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) seqSum+=nums[i];
            else break;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);

        while(set.contains(seqSum)) seqSum++;

        return seqSum;
    }
}