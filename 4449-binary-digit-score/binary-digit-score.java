class Solution {
    public int calculateScore(int a, int b) {
        int s1 = 0;
        int s2 = 0;
        while(a>0 || b>0){
            if((a&1)==1) s1++;
            if((b&1)==1) s2++;
            a = a>>1;
            b = b>>1;
        }
        return ((s1>=s2)?s1*s2:s2/s1);
    }
}