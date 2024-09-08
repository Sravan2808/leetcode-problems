class Solution {
    public int longestConsecutive(int[] nums) {
        // // Brute Force Approach TC:O(n^2),SC:O(1)
        // int longest =1;
        // for(int i=0;i<nums.length;i++){
        // int x=nums[i];
        // int cnt=1;
        // while(linearSearch(nums,x+1)==true){
        // x=x+1;
        // cnt+=1;
        // }
        // longest=Math.max(longest,cnt);
        // }
        // return longest;
        // }
        // public static boolean linearSearch(int nums[],int num){
        // for(int i=0;i<nums.length;i++){
        // if(nums[i] == num)
        // return true;
        // }
        // return false;

        // Better Approach TC:O(nlogn) Sc:O(1)
        // Arrays.sort(nums);
        // int longest = 1;
        // int cnt = 0;
        // int lastSmaller = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] - 1 == lastSmaller) {
        //         cnt = cnt + 1;
        //         lastSmaller = nums[i];
        //     } else if (nums[i] - 1 != lastSmaller) {
        //         cnt = 1;
        //         lastSmaller = nums[i];
        //     }
        //     longest = Math.max(longest, cnt);
        // }
        // return longest;

        // Optimal Approach
        if(nums.length == 0)
        return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt++;
                }
                longest=Math.max(cnt,longest);
            }
        }
        return longest;
    }
}