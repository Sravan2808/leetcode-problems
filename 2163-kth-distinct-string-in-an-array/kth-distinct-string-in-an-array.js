/**
 * @param {string[]} arr
 * @param {number} k
 * @return {string}
 */
var kthDistinct = function(arr, k) {
    let map = new Map();
    for(let i=0;i<arr.length;i++){
        map.set(arr[i],(map.get(arr[i])||0)+1);
    }
    let result = [];
    for(let [ele,freq] of map){
        if(freq==1) result.push(ele);
    }
    return result[k-1] || ""  
};