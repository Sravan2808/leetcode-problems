class Triplet{
    int dist;
    int node;
    int cnt;

    Triplet(int dist,int node,int cnt){
        this.dist = dist;
        this.node = node;
        this.cnt = cnt;
    }
}
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        int dist[][] = new int[n][k+1];
        for(int[] row:dist) Arrays.fill(row,Integer.MAX_VALUE);

        List<List<List<Integer>>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v,wt)));
            // adj.get(v).add(new ArrayList<>(Arrays.asList(u,wt)));
        }

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));

        pq.offer(new Triplet(0,0,1));

        dist[0][1] = 0;

        while(!pq.isEmpty()){
            Triplet t = pq.poll();
            int node = t.node;
            int d = t.dist;
            int cnt = t.cnt;

            if(d>dist[node][cnt]) continue;

            if(node == n-1) return d;


            for(List<Integer> it : adj.get(node)){
                int adjNode = it.get(0);
                int edgeWt = it.get(1);

                int newCnt = (labels.charAt(adjNode)==labels.charAt(node))?cnt+1:1;

                if(newCnt > k) continue;

                if(d+edgeWt<dist[adjNode][newCnt]){
                    dist[adjNode][newCnt] = d+edgeWt;
                    pq.offer(new Triplet(d+edgeWt,adjNode,newCnt));
                }
            }
        }
        return -1;
    }
}