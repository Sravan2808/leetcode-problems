/**
 * @param {number[]} nums
 * @return {number}
 */
var mostFrequentEven = function(nums) {
    let map = new Map();
    for(let i=0;i<nums.length;i++){
        if(nums[i]%2==0)
        map.set(nums[i],(map.get(nums[i])||0)+1);
    }
    let maxFreq = 0;
    let ans = -1;
    for(let [ele,freq] of map){
        if(freq>maxFreq || (freq===maxFreq && ele<ans)){
            maxFreq=freq
            ans=ele
        }
    }
    return ans
};