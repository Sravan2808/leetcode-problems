class Solution {
    public void moveZeroes(int[] nums) {
        //Base case condition
        if(nums.length <= 1)
        return;    
    int i=0,j=1;
    int n=nums.length;
    while(j<n){
        if(nums[i]==0 && nums[j]!=0){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j++;
        }
        else if(nums[i]==0 && nums[j] == 0)
        {
            j++;
        }
        else{
            i++;
            j++;
        }
    }   
}
}