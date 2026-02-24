function solve(x:number,n:number):number{
    if(n==0) return 1.0

    let ans:number = myPow(x,Math.floor(n/2));

    if(n%2==0) return ans*ans;
    return ans*ans*x
}
function myPow(x: number, n: number): number {
    if(n<0){
        n=Math.abs(n);
        return 1/solve(x,n);
    } 
    return solve(x,n)
};