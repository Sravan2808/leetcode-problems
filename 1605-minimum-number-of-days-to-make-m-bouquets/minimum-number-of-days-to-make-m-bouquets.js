/**
 * @param {number[]} bloomDay
 * @param {number} m
 * @param {number} k
 * @return {number}
 */

 function Bouquet(bloomDay,mid,k){
    let count = 0;
    let ans = 0;
    for(let i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=mid){
            count++;
        }
        else{
            ans = ans+Math.floor(count/k);
            count=0;
        }
    }
    ans = ans+Math.floor(count/k)
    return ans
 }

var minDays = function(bloomDay, m, k) {

    let l = Math.min(...bloomDay)
    let r = Math.max(...bloomDay)
    if(bloomDay.length<m*k) return -1;
    let result = -1;

    while(l<=r){
        let mid = Math.floor(l+(r-l)/2);
        let bouquet = Bouquet(bloomDay,mid,k);
        if(bouquet>=m){
            result = mid;
            r=mid-1;
        }
        else l=mid+1;
    }
    return result
};