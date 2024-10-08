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

        // Brute Force Approach TC:O(n^2) SC:O(n)
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         int third = -(nums[i]+nums[j]);
        //         if(hashset.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
        //             temp.sort(null);
        //             st.add(temp);
        //         }
        //         hashset.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        // Optimized Approach
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;

                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;

                }
            }
        }
        return ans;
        
    }
}