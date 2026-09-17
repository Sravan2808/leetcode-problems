class MyComparator implements Comparator<int[]>{
    public int compare(int a[],int b[]){
        return a[1]-b[1];
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new MyComparator());

        int cnt=1;
        int limit = intervals[0][1];
        int n = intervals.length;

        for(int i=1;i<n;i++){
            if(intervals[i][0]>=limit){
                cnt++;
                limit = intervals[i][1];
            }
        }
        return n-cnt;
    }
}