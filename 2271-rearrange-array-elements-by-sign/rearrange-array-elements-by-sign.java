class Solution {
    public int[] rearrangeArray(int[] nums) {
        // bruteForce =>Time Complexity:O(n),Space Complexity:O(n)
        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }
        //     else
        //     neg.add(nums[i]);
        // }
        // for(int i=0;i<nums.length/2;i++){
        //     nums[2*i]=pos.get(i);
        //     nums[2*i+1]=neg.get(i);
        // }
        // return nums;

        // Optimal Approach(Two-Pointer Approach)Tc:O(n),Sc:O(n)

       int ans[] = new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
            else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}