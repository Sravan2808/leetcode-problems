function majorityElement(nums: number[]): number {

    let cnt:number = 0;
    let ans = nums[0]

    for(let value of nums){
        if(cnt==0){
            ans = value
            cnt++
        }else if(value==ans) cnt++;
        else cnt--;
    }
    return ans
};