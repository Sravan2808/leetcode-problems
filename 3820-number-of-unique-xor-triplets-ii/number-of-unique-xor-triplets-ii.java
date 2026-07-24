class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                set1.add(nums[i]^nums[j]);
            }
        }
        for(int pairXor : set1){
            for(int num:nums){
                set2.add(pairXor^num);
            }
        }
        return set2.size();
    }
}