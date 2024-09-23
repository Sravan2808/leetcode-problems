class Solution {
    public int maxProduct(int[] nums) {
        // Better Aprroach TC:O(n^2)
        // int maxi=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int product =1;
        //     for(int j=i;j<nums.length;j++){
        //         product*=nums[j];
        //         maxi = Math.max(maxi,product);
        //     }
        // }
        // return maxi;

        // Optimial Approach OBSERVATION Tc:O(n)
        int maxi=Integer.MIN_VALUE;
        int prefix=1,suffix=1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-i-1];
            maxi =Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;

        
    }
}