class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> hmap= new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i]+k)){
                count+=hmap.get(nums[i]+k);
            }
            if(k!=0&&hmap.containsKey(nums[i]-k)){
                hmap.get(nums[i]-k);
                count+=hmap.get(nums[i]-k);
            }
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
           
        }
        return count;
    }
}