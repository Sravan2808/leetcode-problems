class Solution {
    public long pickGifts(int[] gifts, int k) {
         List<Integer> giftList = new ArrayList<>();
        for(int gift : gifts){
            giftList.add(-gift);
        }
        long Sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(giftList);
        while(k-- >0){
            int maxEle = -pq.poll();

            pq.offer(-(int)Math.sqrt(maxEle));
        }
        long noOfRemGifts=0;
        while(!pq.isEmpty()) noOfRemGifts -= pq.poll();
        return noOfRemGifts;
       
    }
}