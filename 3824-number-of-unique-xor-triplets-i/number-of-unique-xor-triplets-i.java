class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<=2) return n;
        int bits = 0;
        while(n>0){
            bits++;
            n=n>>1;
        }

        return 1<<bits;
        
    }
}