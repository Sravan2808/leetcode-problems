class Solution {
    public int mySqrt(int x) {
    //     // inbuilt in java
    //    int n= (int)Math.sqrt(x);
    //    return n;
    
    // TC:O(n),SC:O(1)
    //  int ans = 0;
    // for(int i=1;i<=x;i++){
    //     if(i*i<=x) ans=i;
    //     else break;
    // }
    // return  ans;
    long ans =0;
    long low = 1;
    long high=x;
    while(low<=high){
        long mid=(low+high)/2;
        if(mid*mid<=x){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return (int)ans;
    
        
    }
}