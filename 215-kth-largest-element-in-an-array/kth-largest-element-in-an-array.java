class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        // 1.Build minheap - O(n)
        for(int num : nums){
            minheap.add(num);
        // 2.Deletion - (n-k)times - (n-k)logn
        if(minheap.size()>k){
            minheap.remove();
        }
        }
        // 3.return the root node element
        return minheap.peek();
        
    }
}