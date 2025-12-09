class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap =  new HashMap<Integer,Integer>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int comp = target-nums[i];
            if(hmap.containsKey(comp)){
                return new int[]{hmap.get(comp),i}; 
            }
            hmap.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}