class Solution {
    public int singleNumber(int[] nums) {
        //  Hashing

        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int value=mp.getOrDefault(nums[i],0);
        //     mp.put(nums[i],value+1);
        // }
        // for(Map.Entry<Integer,Integer> it : mp.entrySet()){
        //     if(it.getValue()==1)
        //     return it.getKey();
        // }
        // return -1;

        // Xor
        int xor=0;
        for(int i=0;i<nums.length;i++)
        xor=xor^nums[i];
        return xor;
    }
}