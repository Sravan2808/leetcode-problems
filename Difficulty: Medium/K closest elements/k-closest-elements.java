class Pair implements Comparable<Pair>{
    int diff;
    int value;
    Pair(int diff,int value){
        this.diff = diff;
        this.value = value;
    }
    public int compareTo(Pair p){
        if(this.diff==p.diff) return this.value-p.value;
        return p.diff - this.diff;
    }
}

class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int num:arr){
            if(num==x) continue;
            int diff = Math.abs(num-x);
            pq.offer(new Pair(diff,num));
            if(pq.size()>k) pq.poll();
        }
        int ans[] = new int[k]; 
        int i=0;
        while(!pq.isEmpty()) ans[i++] = pq.poll().value;
        int left = 0;
        int right = k-1;
        while(left<right){
            int temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
        return ans;
    }
}
