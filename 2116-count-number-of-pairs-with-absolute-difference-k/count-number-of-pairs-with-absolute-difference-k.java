class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
            map.put(nums[i],1);
            }
        }

        int cnt = 0;
        for(int num : nums){
            int com = k+num;
            if(map.containsKey(com)){
                cnt+=map.get(com);
            }
        }
        return cnt;
        
    }
}