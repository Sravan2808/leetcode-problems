class Solution {
    public int countSubsets(int idx,int currOr,int nums[],int maxOr){
        // Base Case Condition
        if(idx==nums.length){
            if(currOr == maxOr) return 1;//Found one subsert
            return 0;
        }
        // Take nums[idx]
        int takeCount = countSubsets(idx+1,currOr | nums[idx] ,nums,maxOr);

        // Not take nums[idx]
        int nottakeCount = countSubsets(idx+1,currOr,nums,maxOr);

        return takeCount+ nottakeCount;
    }
    public int countMaxOrSubsets(int[] nums) {
       int maxOr = 0;
       for(int num : nums) maxOr |= num;

       int currOr = 0;
       return countSubsets(0,currOr,nums,maxOr);
        
    }
}