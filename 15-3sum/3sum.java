class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // // BruteForce Approah :TC:O(n^3) TLE
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //             List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //             temp.sort(null);
        //             st.add(temp);
        //         }
        //     }
        // }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        // Brute Force Approach
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
        
    }
}