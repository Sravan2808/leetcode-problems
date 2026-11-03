class Pair{
    int price;
    int stock;
    Pair(int price,int stock){
        this.price = price;
        this.stock = stock;
    }
}
class StockSpanner {
    Stack<Pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int stock = 1;
        while(!st.isEmpty() && st.peek().price<=price) stock+=st.pop().stock;
        st.push(new Pair(price,stock));
        return stock;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */