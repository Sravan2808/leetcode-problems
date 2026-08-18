class Solution {
    public int largestInteger(int[] nums, int k) {
        int value = Integer.MIN_VALUE;
        int n = nums.length;
        if(n==k){
            int res = nums[0];
            for(int x:nums) res=Math.max(res,x);
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        int i=1,j=k;
        while(j<n){
            for(int w=i;w<=j;w++) map.put(nums[w],map.getOrDefault(nums[w],0)+1);
            i++;
            j++;
        }

        for(int key:map.keySet()){
            if(map.get(key)==1) value = Math.max(value,key);
        }
        return value!=Integer.MIN_VALUE?value:-1;
    }
}