class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a =nums[i];
            int more=target-a;
            if(map.containsKey(more)){
                return new int[] {map.get(more),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}