class Solution {
    public double myPow(double x, int n) {

        // Iterative Approach Time Complexity:O(logn) Space Complexity:O(1)
        // double ans = 1.0;
        // long power = n;
        // if(power<0){
        //     x=1/x;
        //     power=-1*power;
        // }
        // while(power>0){
        //     if(power%2==0){
        //         x=x*x;
        //         power=power/2;
        //     }else{
        //         ans=ans*x;
        //         power=power-1;
        //     }
        // }
        // return ans;

        // Recursive Approach : Time Complexity:O(logn) Space Complexity:O(logn)
        long num = n;
        if(num<0){
            return 1.0/recursiveApproach(x,-1*num);
        }
        return recursiveApproach(x,num);
    }
    private double recursiveApproach(double x,long n){
        if(n==0) return 1;
        
        if(n%2!=0) return x*recursiveApproach(x,n-1);
        return recursiveApproach(x*x,n/2);
    }
}