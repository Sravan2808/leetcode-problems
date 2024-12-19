class Solution {
    public int maxChunksToSorted(int[] arr) {
        // TimeComplexity : O(n)
        // Space Complexity : O(n)
        // int n = arr.length;
        // int prefixMax[] = new int[n];
        // int suffixMin[] = new int[n];
        // prefixMax[0] = arr[0];
        // suffixMin[n-1] = arr[n-1];
        // for(int i=1;i<n;i++){
        //     prefixMax[i]= Math.max(arr[i],prefixMax[i-1]);
        // }
        // for(int i= n-2;i>=0;i--){
        //     suffixMin[i]= Math.min(arr[i],suffixMin[i+1]);
        // }
        // int chunks = 0;

        // for(int i=0;i<n;i++){
        //     int max = i>0?prefixMax[i-1]:-1;
        //     int min = suffixMin[i];

        //     if(max<min){
        //         chunks++;
        //     }
        // }
        // return chunks;

        int n = arr.length;

        int cumSum = 0;
        int originalSum = 0;
        int chunks = 0;
        for(int i=0;i<n;i++){
            cumSum+=arr[i];
            originalSum+=i;

            if(cumSum==originalSum){
                chunks++;
            }
        }
        return chunks;
    }
}