/**
 * @param {number[]} nums
 * @return {number[][]}
 */

 function Backtrack(ans,curr,i,nums){
    if(i==nums.length){
        ans.push([...curr])
        return
    }

    //Pick
    curr.push(nums[i]);
    Backtrack(ans,curr,i+1,nums);

    // remove
    curr.pop();

    // Not Pick

    Backtrack(ans,curr,i+1,nums)
 }
var subsets = function(nums) {
    let ans = [];
    Backtrack(ans,[],0,nums)
    return ans;
};