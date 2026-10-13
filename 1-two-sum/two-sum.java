class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // int ans[] = new int[n];
        int ele[][] = new int[n][2];
        for(int i=0;i<n;i++){
            ele[i][0] = nums[i];
            ele[i][1] = i;
        }

        Arrays.sort(ele,(a,b)->a[0]-b[0]);
        
        int left = 0,right=n-1;
        while(left<right){
            int sum = ele[left][0]+ele[right][0];
            if(sum==target) return new int[]{ele[left][1],ele[right][1]};
            if(sum<target) left++;
            else right--;
        }

        return new int[]{-1,-1};
    }
}