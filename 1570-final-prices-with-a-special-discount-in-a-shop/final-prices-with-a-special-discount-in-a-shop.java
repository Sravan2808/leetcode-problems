class Solution {
    public int[] finalPrices(int[] prices) {
        // bruteForce Approach
        // int n = prices.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(prices[j]<=prices[i]){
        //             prices[i]-=prices[j];
        //             break;
        //         }
        //     }
        // }
        // return prices;
        
        // Monotonic Stack
        Stack<Integer> st = new Stack<>();
        int n = prices.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()] >= prices[i]){
            prices[st.peek()] -= prices[i];
            st.pop();
            }
            st.push(i);
        }
        return prices;
    }
}