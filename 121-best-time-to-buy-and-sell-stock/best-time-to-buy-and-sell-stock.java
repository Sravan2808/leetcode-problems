class Solution {
    public int maxProfit(int[] prices) {
        // Time Complexity:O(n) , Space Complexity:O(1)
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
        
    }
}