class Solution {
    public int missingNumber(int[] nums) {
    //     int n=nums.length;
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //     }
    //     return n*(n+1)/2-sum;
    // }

    // Xor Operation
    int xor1=0;
    int xor2=0;
        for(int i=0;i<nums.length;i++){
            xor2=xor2^nums[i];
            xor1=xor1^i+1;
        }
        // xor1=xor1^nums.length;
        return xor1^xor2;
    }
}