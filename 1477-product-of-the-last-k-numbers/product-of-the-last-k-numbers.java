class ProductOfNumbers {
    List<Integer> product;
    public ProductOfNumbers() {
        product = new ArrayList<>();
    }
    
    public void add(int num) {
        product.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int n = product.size();
        for(int i=0;i<k;i++) prod*=product.get(n-i-1);
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */