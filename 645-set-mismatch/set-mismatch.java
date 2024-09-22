class Solution {
    public int[] findErrorNums(int[] nums) {
        // BruteForce TC:O(N^2),SC:O(1)
        // int repeating=-1,missing=-1;
        // for(int i=1;i<=nums.length;i++){
        //     int cnt=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==i)
        //         cnt++;
        //     }
        //     if(cnt==2) repeating=i;
        //     else if(cnt==0) missing=i;
        //     if(repeating!=-1 && missing!=-1) break;
        // }
        // int ans[] ={repeating,missing};
        // return ans;

        // BetterApproach(Hashing)  TC:O(n) Sc:O(n)
        // int repeating=-1,missing=-1;
        // int n = nums.length;
        // int[] hash = new int[n+1];
        // for(int i=0;i<n;i++){
        //     hash[nums[i]]++;
        // }
        // for(int i=1;i<=n;i++){
        //     if(hash[i]==2) repeating=i;
        //     else if(hash[i]==0) missing=i;
        // }
        // int ans[]={repeating,missing};
        // return ans;

        // OptimalApproach 
        long n=nums.length;
        // S-Sn
        // S2-S2n
        long Sn = (n*(n+1))/2;
        long S2n=(n*(n+1)*(2*n+1))/6;
        long S=0,S2=0;
        for(int i=0;i<n;i++){
            S+=nums[i];
            S2+=(long)nums[i] * (long)nums[i];
        }
        long val1=S-Sn;//x-y
        long val2=S2-S2n;//x+y
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y =x-val1;
        int ans[]={(int)x,(int)y};
        return ans;
    }
    
}