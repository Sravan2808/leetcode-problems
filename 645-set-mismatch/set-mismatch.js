/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    let n = nums.length
        let map = new Map();
        for(let i=0;i<nums.length;i++){
            map.set(nums[i],(map.get(nums[i])||0)+1);
        }
        let sum = 0;
        let duplicateele = 0;
        for(let [ele,freq] of map){
            if(freq==2) duplicateele=ele
            sum+=ele;
        }
        let missingElem = (n*(n+1)/2 - sum)
        return [duplicateele,missingElem]
    
};