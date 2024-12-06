class Solution {
    // Time Complexity : O(N) Space Complexity : O(M)
    public int maxCount(int[] banned, int n, int maxSum) {
        int count =0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : banned){
            set.add(num);
        }
        for(int num = 1;num <= n;num++){
            if(set.contains(num)) continue;
            if(sum+num<=maxSum){
                sum+=num;
                count++;
            }
            else break;
        }
        return count;
    }
}