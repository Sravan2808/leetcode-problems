class Solution {
    public int sumOfSquares(int[] nums) {
        // Time Complexity:O(n) Sc:O(1)
        // int n = nums.length;
        // int ans = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(n%(i+1)==0) ans+=nums[i]*nums[i];
        // }
        // return ans;

        // TimeComplexity : O(root(N)) Sc:O(1)
        int n = nums.length;
        int ans = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ans += nums[i - 1] * nums[i - 1];

                if (i!=n/i) {
                    ans += nums[n / i - 1] * nums[n / i - 1];
                }
            }
        }

        return ans;
    }
}