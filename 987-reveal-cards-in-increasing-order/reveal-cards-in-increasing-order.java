class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
         Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            q.add(i);
        }
        for(int i=0;i<n;i++){
            arr[q.peek()]=deck[i];
            q.poll();
            if(!q.isEmpty()){
                q.add(q.peek());
                q.poll();
            }
        }
        return arr;
        
    }
}