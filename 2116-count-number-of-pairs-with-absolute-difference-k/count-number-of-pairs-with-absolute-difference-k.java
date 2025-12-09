class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //     map.put(nums[i],1);
        //     }
        // }

        // int cnt = 0;
        // for(int num : nums){
        //     int com = k+num;
        //     if(map.containsKey(com)){
        //         cnt+=map.get(com);
        //     }
        // }
        // return cnt;

        int cnt = 0;

       for(int i=0;i<nums.length;i++){
        if(map.containsKey(k+nums[i])){
            cnt += map.get(k+nums[i]);
        }
        if(map.containsKey(nums[i]-k)){
            cnt += map.get(nums[i]-k);
        }

       map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       return cnt;
    }
}