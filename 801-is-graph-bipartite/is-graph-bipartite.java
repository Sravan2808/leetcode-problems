class Solution {
    private boolean dfs(int start,int col,List<List<Integer>> adj,int color[]){
        color[start] = col;
        for(int it:adj.get(start)){
            if(color[it]==-1){
                color[it] = color[start]==0?1:0;
                if(!dfs(it,color[it],adj,color)) return false;
            }else if(color[it]==color[start]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int color[] = new int[V];
        Arrays.fill(color,-1);

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<V;i++){
            for(int v:graph[i]) adj.get(i).add(v);
        }

        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(!dfs(i,0,adj,color)) return false;
            }
        }

        return true;
    }
}