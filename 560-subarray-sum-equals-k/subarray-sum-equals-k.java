class Solution {
    public int subarraySum(int[] nums, int k) {
        // // Brute Force And Better Approach :Tc:O(n^2) and Sc:O(1)
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k)
        //         count++;
        //     }
        // }
        // return count;

        Map<Integer,Integer> prefixSum = new HashMap<Integer,Integer>();
        int count=0;
        int sum=0;
        prefixSum.put(0,1);
        for(int num : nums){
            sum+=num;
            if(prefixSum.containsKey(sum-k)){
                count+=prefixSum.get(sum-k);
            }
            prefixSum.put(sum,prefixSum.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}