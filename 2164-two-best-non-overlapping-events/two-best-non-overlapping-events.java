class Solution {
    int dp[][] = new int[100001][3];
    int binarySearch(int events[][],int endTime){
        int low = 0;
        int high = events.length-1;
        int result = events.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(events[mid][0]>endTime){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
    int solve(int events[][],int i,int count){
        if(count==2 ||i>=events.length) return 0;

        if(dp[i][count] != -1) return dp[i][count];

        int nextValidEventIndex = binarySearch(events,events[i][1]);
        int take = events[i][2]+solve(events,nextValidEventIndex,count+1);
        int not_take = solve(events,i+1,count);
        
        dp[i][count] = Math.max(take,not_take);
        return dp[i][count];
    }
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0])); //Sort events by start time
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        int count = 0;
        return solve(events,0,count);
        
    }
}