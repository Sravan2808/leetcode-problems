class MedianFinder {
    PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> larger = new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(smaller.size()==0) smaller.offer(num);
        else{
            if(num<=smaller.peek()) smaller.offer(num);
            else larger.offer(num);
        }
        if(smaller.size()>larger.size()+1) larger.offer(smaller.poll());
        if(larger.size()>smaller.size()) smaller.offer(larger.poll());
    }
    
    public double findMedian() {
        if(smaller.size()==larger.size()) return (smaller.peek()+larger.peek())/2.0;
        else return smaller.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */