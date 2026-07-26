class Solution {
    public int maximumProduct(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int num3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num:nums){
            if(num>num1){
                num3=num2;
                num2=num1;
                num1=num;
            }else if(num>num2){
                num3=num2;
                num2=num;
            }else if(num>num3){
                num3=num;
            }

            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }
        return Math.max(num1*num2*num3,num1*min1*min2);
    }
}