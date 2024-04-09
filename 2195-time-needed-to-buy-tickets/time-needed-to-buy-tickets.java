class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeneeded=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                timeneeded += Math.min(tickets[k],tickets[i]);
            }
            else{
                timeneeded += Math.min(tickets[k]-1,tickets[i]);
            }
        }
        return timeneeded;
        
    }
}