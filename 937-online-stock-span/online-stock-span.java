class StockSpanner {
    Stack<Integer> prices,days;

    public StockSpanner() {
        prices = new Stack<>();
        days = new Stack<>();
    }
    
    public int next(int price) {
        int ans = 1;
        while(!prices.isEmpty() && prices.peek()<=price){
            prices.pop();
            ans+=days.pop();
        }
        prices.push(price);
        days.push(ans);
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */