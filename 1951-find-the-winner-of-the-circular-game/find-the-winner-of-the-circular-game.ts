function solve(arr:number[],k:number,i:number){
    if(arr.length==1) return arr[0];
    let remove = (i+k)%arr.length;
    arr.splice(remove,1);
    return solve(arr,k,remove);
}

function findTheWinner(n: number, k: number): number {
    let arr:number[] = [];
    for(let i=1;i<=n;i++) arr.push(i);
    k = k-1;
    return solve(arr,k,0);
};