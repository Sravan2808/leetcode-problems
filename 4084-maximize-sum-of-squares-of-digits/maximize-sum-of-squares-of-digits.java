class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();

        //The sum should be sum<9*num else return empty string
        if(sum>9*num) return "";

        // Check the nine value with divisible them if it is divisible add in new String
        int nines = sum/9;
        for(int i=0;i<nines;i++) ans.append("9");

        // Check the remaining number and add to String
        int rem = sum%9;
        if(rem>0) ans.append(rem);

        // Check the num and ans.length() is same if not then append zeros
        int zeros = num-ans.length();

        for(int i=0;i<zeros;i++) ans.append("0");

        return ans.toString();

    }
}