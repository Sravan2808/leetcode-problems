class Solution {
    private int digits(int n){
        if(n<=0) return 1;
        int cnt = (int)(Math.log10(n)+1);
        return cnt;
    }
    private int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(digits(nums[i])>1){
                if(sumDigit(nums[i])==i) minNum=Math.min(minNum,i);
            }
            else{
                if(i==nums[i]) minNum = Math.min(minNum,i);
            }
        }
        return (minNum==Integer.MAX_VALUE)?-1:minNum;
    }
}