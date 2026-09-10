function findGCD(nums: number[]): number {
    let max:number =Math.max(...nums);
    let min:number = Math.min(...nums);
    
    while(max>0 && min>0){
        if(max>min) max=max%min;
        else min = min%max;
    }
    if(max==0) return min;
    return max;
};