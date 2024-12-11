class Solution {
    public int binarySearch(int nums[],int target){
        int result = 0;
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<=target){
                result=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return result;
    }
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int maxBeauty = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int y = x+2*k;
            // find the farthest y<=x+2k
            int j = binarySearch(nums,y);
            maxBeauty = Math.max(maxBeauty,j-i+1);
        }
      return maxBeauty;

    }
}