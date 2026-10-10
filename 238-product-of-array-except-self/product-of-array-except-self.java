class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        int arr[] = new int[n];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i]; //prefix[] = [1,2,6,24]
            suffix[n-i-1] = suffix[n-i]*nums[n-i-1]; //suffix=[24,24,12,4]
        }
         
         arr[0] = suffix[1];
         arr[n-1] = prefix[n-2];
        //  [1,2,3,4]
         for(int i=1;i<n-1;i++){
            arr[i] =  prefix[i-1]*suffix[i+1];
        //  [24,12,8,]
         }
         return arr;
    }
}