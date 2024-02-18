class Solution {
    public boolean isPowerOfFour(int n) {
        // base case condition
        if(n==1)
        return true;

        if(n<=0 || n%4 != 0)
        return false;
        else
        return isPowerOfFour(n/4);
    }
}