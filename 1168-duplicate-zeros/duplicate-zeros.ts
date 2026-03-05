/**
 Do not return anything, modify arr in-place instead.
 */
function duplicateZeros(arr: number[]): void {
    let cnt:number = 0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]==0) cnt++;
    }
    let i= arr.length-1;
    let j = arr.length-1+cnt;
    while(i>=0){
        if(j<arr.length) arr[j] = arr[i];
        j--;
        if(arr[i]==0){
            if(j<arr.length) arr[j]=0;
            j--;
        }
        i--;
    }
    
};