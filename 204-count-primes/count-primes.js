/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    let isPrime = new Array(n).fill(true);
    if(n<=1) return 0;
    for(let i=2;i<Math.sqrt(n);i++){
        if(isPrime[i]){
            for(let j=i*i;j<n;j+=i){
                isPrime[j]=false;
            }
        }
    }

    let cnt = 0;
    for(let i=2;i<n;i++){
        if(isPrime[i]) cnt++;
    }
    return cnt;
};