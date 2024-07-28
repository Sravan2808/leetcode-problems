class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPosition=-1;
        int lastPosition=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                if(firstPosition==-1)
                firstPosition=i;
                lastPosition=i;
            }
        }
        return new int[]{firstPosition,lastPosition};
        
    }
}