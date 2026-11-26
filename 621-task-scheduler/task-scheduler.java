class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int map[] = new int[26];

        for(char task:tasks) map[task-'A']++;

        for(int i:map) if(i>0) pq.offer(i);

        int time = 0;

        while(!pq.isEmpty()){

            List<Integer> temp = new ArrayList<>();

            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                int freq = pq.poll();
                freq--;
                temp.add(freq);
                }
            }

            for(int t:temp){
                if(t>0) pq.offer(t);
            }

            if(pq.isEmpty()) time+=temp.size();
            else time+=n+1;
        }

        return time;
    }
}