class Pair implements Comparable<Pair>{
    int diff;
    int val;
    Pair(int diff,int val){
        this.diff = diff;
        this.val = val;
    }
    public int compareTo(Pair p){
        if(this.diff == p.diff) return p.val-this.val;
        return p.diff-this.diff;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int num:arr){
            int diff = Math.abs(num-x);
            pq.offer(new Pair(diff,num));
            if(pq.size()>k) pq.poll();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()) ans.add(pq.poll().val);
        Collections.sort(ans);
        return ans; 
    }
}