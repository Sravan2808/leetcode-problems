class Solution {
    int Bits(int ele){
        int cnt = 0;
        for(int i=0;i<32;i++){
            if(((ele>>i)&1)==1) cnt++;
        }
        return cnt;
    }
    boolean factor(int n ){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0) cnt++;
        }
        if(cnt==2) return true;
        return false;
    }
    public int countPrimeSetBits(int left, int right) {
        int prime = 0;
        for(int i=left ;i<=right;i++){
            int cnt  = Bits(i);
            if(factor(cnt)){
                prime++;
            }
        }
        return prime;
    }
}