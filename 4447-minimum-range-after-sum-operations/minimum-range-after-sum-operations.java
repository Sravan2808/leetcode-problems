class Solution {
    public int minRange(int a, int b, int c) {
        if(a>b+c) a=b+c;
        else if(b>a+c) b=a+c;
        else if(c>a+b) c=a+b;
        int maxiVal = Math.max(a,Math.max(b,c));
        int miniVal = Math.min(a,Math.min(b,c));

        return maxiVal - miniVal;
    }
}