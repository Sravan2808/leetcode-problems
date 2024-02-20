class Solution {
    public double ans(double x,long n){
        // 1.Base case condition
        if(n==0)
        return 1;
        // n is negative
        if(n<0)
        return ans(1/x,-n);
        // if n is even
        if(n%2==0){
            return ans(x*x,n/2);
        }
        else
        return x*ans(x*x,(n-1)/2);
    }
    public double myPow(double x, int n) {
                return ans(x,(long)n);
                        
    }
}