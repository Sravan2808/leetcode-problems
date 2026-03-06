function maxSubArray(nums: number[]): number {
    let maxSum:number = Math.max(...nums);
    let currSum:number = 0;
    for(let value of nums){
        currSum += value;
        maxSum = Math.max(currSum,maxSum);
        if(currSum<0) currSum=0;
    }
    return maxSum
    
};