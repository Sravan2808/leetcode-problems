class Solution {
    private int func(int nums[]){
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for(int i=1;i<n;i++){
            // take
            int pick = nums[i];
            if(i>1) pick+=prev2;
            
            int not_pick = prev;

            int curr = Math.max(pick,not_pick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int arr1[] = new int[n - 1];
        int arr2[] = new int[n - 1];

        for (int i = 0; i < n; i++) {
            if (i != n - 1)
                arr1[i] = nums[i];
            if (i != 0)
                arr2[i - 1] = nums[i];
        }

        int ans1 = func(arr1);
        int ans2 = func(arr2);

        return Math.max(ans1,ans2);
    }
}