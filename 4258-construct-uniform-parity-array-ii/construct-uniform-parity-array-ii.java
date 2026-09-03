class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int oddnum = 0;

        // Arrays.sort(nums1);

        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                oddnum = (oddnum==0)?nums1[i]:Math.min(oddnum,nums1[i]);
            }
        }

        for(int i=0;i<n;i++){
            if(nums1[i]%2==0 && nums1[i]-oddnum<=0) return false;
            else{
                nums1[i] = nums1[i]-oddnum;
            }
        }
        return true;
    }
}