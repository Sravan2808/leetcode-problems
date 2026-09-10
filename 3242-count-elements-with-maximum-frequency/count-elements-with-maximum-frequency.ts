function maxFrequencyElements(nums: number[]): number {
    const map = new Map<number,number>();
    for(const x of nums) map.set(x,(map.get(x)||0)+1);
    let maxFreq:number = Math.max(...map.values());
    let sum:number = 0;
    for(const x of map.values()){
        if(maxFreq==x) sum+=x;
    } 
    return sum;
};