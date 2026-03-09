function trap(height: number[]): number {
    let leftMax:number = 0;
    let rightMax:number = 0;
    let left:number = 0;
    let right:number = height.length-1;
    let total:number = 0;

    while(left<right){
        leftMax = Math.max(leftMax,height[left]);
        rightMax = Math.max(rightMax,height[right]);
        if(leftMax<rightMax){
            total += leftMax-height[left];
            left++;
        }else{
            total += rightMax-height[right];
            right--;
        }
    }
        return total;
    
};