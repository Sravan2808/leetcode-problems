class Solution {
    boolean isPossible(int nums[],int maxOperations,int mid){
        int totalOp = 0; //to bring each number<=mid
        for(int num : nums){
            int op = num/mid;
            if(num%mid==0) op=op-1;

            totalOp = totalOp+op;
        }
        return totalOp<=maxOperations;
    }
    int max(int nums[]){
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maximum = Math.max(nums[i],maximum);
        }
        return maximum;
    }
    // TC:O(n*log(max))
    public int minimumSize(int[] nums, int maxOperations) {
        int l =1 ;
        int r = max(nums);
        int result = r;//we have to minimize this
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossible(nums,maxOperations,mid) == true){
                result = mid;
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
}