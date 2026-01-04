class Solution {
    public int Divisors(int nums){
        int cnt = 0;
        int sum = 0;
        for(int i=1;i*i<=nums;i++){
            if(nums % i == 0){
                int j = nums/i;
                sum += i;
                cnt++;
                if(i!=j){
                    cnt++;
                    sum+=j;
                }
            }
        }
        if(cnt==4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int result = Divisors(nums[i]);
            ans = ans + result;
        }
        return ans;
    }
}