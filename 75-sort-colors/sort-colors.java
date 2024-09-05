class Solution {
    public void sortColors(int[] nums) {
        // Tc:O(n) Condition
        // int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0)
        //         cnt0++;
        //     else if (nums[i] == 1)
        //         cnt1++;
        //     else
        //         cnt2++;
        // }
        // for (int i = 0; i < cnt0; i++)
        //     nums[i] = 0;
        // for (int i = cnt0; i < cnt0 + cnt1; i++)
        //     nums[i] = 1;
        // for (int i = cnt0 + cnt1; i < nums.length; i++)
        //     nums[i] = 2;

        //Dutch National Flag Algorithm
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
            mid++;
            }
            else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            }
        }
    }
}