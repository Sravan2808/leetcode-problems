class Solution {
    private int Sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    private int Product(int n){
        int product = 1;
        while(n>0){
            product *= n%10;
            n=n/10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
        int digitSum = Sum(n);
        int digitProduct = Product(n);
        return (n%(digitSum+digitProduct))==0?true:false;
    }
}