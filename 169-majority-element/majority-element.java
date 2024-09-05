class Solution {
    public int majorityElement(int[] nums) {
        // Brute Force Approach => TC:O(n^2)
        // for (int i = 0; i < nums.length; i++) {
        // int cnt = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] == nums[j])
        // cnt++;
        // }
        // if (cnt > nums.length / 2)
        // return nums[i];
        // }
        // return -1;

        // Better Approach =>Hashing =>Tc:O(n),Sc:O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> it : map.entrySet()) {
        //     if (it.getValue() > nums.length / 2)
        //         return it.getKey();
        // }
        // return -1;

        // Optimal Approach =>Moore's voting Algorithm
        int cnt=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                ele=nums[i];
            }
            cnt+=(nums[i]==ele)?1:-1;
        }
        return ele;
    }
}