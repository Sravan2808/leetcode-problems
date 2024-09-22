class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeating=-1,missing=-1;
        for(int i=1;i<=nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i)
                cnt++;
            }
            if(cnt==2) repeating=i;
            else if(cnt==0) missing=i;
            if(repeating!=-1 && missing!=-1) break;
        }
        int ans[] ={repeating,missing};
        return ans;
        
    }
    
}