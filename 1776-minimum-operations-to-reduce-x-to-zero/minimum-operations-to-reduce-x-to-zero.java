class Solution {
    public int minOperations(int[] nums, int x) {
        int n =  nums.length;
        int sum  =  0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            map.put(sum,i);
        }
        if(sum<x) return -1;
        int remainingSum = sum-x;
        int ans = Integer.MIN_VALUE;
        sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            int findSum = sum-remainingSum;
            if(map.containsKey(findSum)) ans=Math.max(ans,i-map.get(findSum));
        }

        return ans==Integer.MIN_VALUE?-1:n-ans;
    }
}