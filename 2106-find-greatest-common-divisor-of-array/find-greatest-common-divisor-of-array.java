class Solution {
    public int gcdPointer(int a,int b){
        if(b == 0) return a;
        return gcdPointer(b,a%b);
    }
    public int gcd(int largest,int smallest){
        // if(largest>smallest) return gcdPointer(largest,smallest);
        return gcdPointer(smallest,largest);
    }
    public int findGCD(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            largest = Math.max(largest,nums[i]);
            smallest = Math.min(smallest,nums[i]);
        }
        int ans = gcd(largest,smallest);
        return ans;    
    }
}