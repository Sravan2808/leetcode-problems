class Solution {
    public int[] sortArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int freq[] = new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            int idx = nums[i] - min;
            freq[idx]++;
        }
        int k =0;
        for(int i=0;i<max-min+1;i++){
            int ele = i+min;
            for(int cnt=1;cnt<=freq[i];cnt++){
                nums[k] = ele;
                k++;
            }
        }
        return nums;
    }
}