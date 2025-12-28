class Solution {
    static final int MOD = 1_000_000_007;

    long GCD(long a,long b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
    long LCM(long a,long b){
        return a*b/GCD(a,b);
    }
    long count(long mid,long a,long b){
        return mid/a+mid/b-mid/LCM(a,b);
    }
    public int nthMagicalNumber(int n, int a, int b) {
      long l=0;long r=(long) n * Math.min(a,b);
      long ans=0;
      while(l<=r){
        long mid = l+(r-l)/2;
        if(count(mid,a,b)>=n){
            ans = mid;
            r=mid-1;
        }
        else if(count(mid,a,b)<n){
            l=mid+1;
        }
        else r=mid-1;
      }
      return (int) (ans%MOD);
    }
}