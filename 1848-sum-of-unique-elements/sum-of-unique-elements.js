/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfUnique = function(nums) {
    let map = new Map();
    let sum = 0;
    for(let i=0;i<nums.length;i++){
        map.set(nums[i],(map.get(nums[i]) | 0)+1);
    }
    for(let key of map.keys()){
        if(map.get(key)==1)
        sum+=key;
    }
    return sum;
};