class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target) return mid;
            // it is in part-1
            if(nums[mid]>=nums[0]){
                if(target>=nums[0]){
                    if(nums[mid]<target) l=mid+1;
                    else r=mid-1;
                }
                else l=mid+1;
            }
            else{
                if(target<nums[0]){
                    if(nums[mid]<target) l=mid+1;
                    else r=mid-1;
                }
                else r= mid-1;
            }
        }
        return -1;
        
    }
}