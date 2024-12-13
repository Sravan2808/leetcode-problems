class Solution {
    public long findScore(int[] nums) {
       int n = nums.length;
       long score = 0;

       int pairs[][] = new int[n][2];
       for(int i=0;i<n;i++){
        pairs[i][0] = nums[i];
        pairs[i][1] = i;
       }
       Arrays.sort(pairs,(a,b) -> {
        if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
        return Integer.compare(a[1],b[1]);
       });
       boolean visited[] = new boolean[n];

       for(int i=0;i<n;i++){
        int value = pairs[i][0];
        int index = pairs[i][1];

        if(!visited[index]){
            score+=value;
            visited[index] = true;

            if(index-1>=0){
                visited[index-1] = true;
            }
            if(index+1<n){
                visited[index+1] = true;
            }
        }
       }
       return score;
    }
}