class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
        
    }
    private int helper(int[] nums,int index,int currentXor)
    {
        if(index==nums.length)
        {
            return currentXor;
        }
        //calculate sum of xor with current element : include the element
        int withElement = helper(nums,index+1,currentXor^nums[index]);
        // calculate xor without the element
        int withoutElement = helper(nums,index+1,currentXor);
        return withElement+withoutElement;

    }
}