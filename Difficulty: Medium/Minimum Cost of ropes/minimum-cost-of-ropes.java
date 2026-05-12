class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:arr) pq.offer(x);
        int cost = 0;
        while(pq.size()!=1){
            int l1 = pq.poll();
            int l2 = pq.poll();
            cost+=l1+l2;
            pq.offer(l1+l2);
        }
        return cost;
    }
}