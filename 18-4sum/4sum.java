class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         Set<Long> hashSet = new HashSet<>();
        //         for(int k=j+1;k<n;k++){
        //             Long sum = nums[i]+nums[j];
        //             sum+=nums[k];
        //             long fourth = target-sum;
        //             if(hashSet.contains(fourth)){
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 temp.add((int)fourth);
        //                 temp.sort(null);
        //                 st.add(temp);
        //             }
        //             hashSet.add((Long)nums[k]);
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;
        
        // OPtimal Approach
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k =j+1;
                int l = nums.length-1;
                while(k<l){
                    long sum=(long) nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                     List<Integer> temp = new ArrayList<>();
                     temp.add(nums[i]);
                     temp.add(nums[j]);
                     temp.add(nums[k]);
                     temp.add(nums[l]);
                     ans.add(temp);
                     k++;
                     l--;
                     while(k<l && nums[k]==nums[k-1]) k++;
                     while(k<l && nums[l]==nums[l+1]) l--;  
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}