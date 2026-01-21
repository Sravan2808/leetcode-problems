class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int[] NSL = new int[n];
        int[] NSR = new int[n];
        Arrays.fill(NSL,-1);
        Arrays.fill(NSR,n);
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && heights[st1.peek()]>=heights[i]){
                st1.pop();
            }
            if(!st1.isEmpty()){
                NSL[i] = st1.peek();
            }
            st1.push(i);
        }

        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && heights[st2.peek()]>=heights[i]){
                st2.pop();
            }
            if(!st2.isEmpty()){
                NSR[i] = st2.peek();
            }
            st2.push(i);
        }


        int ans = -1;
        for(int i=0;i<heights.length;i++){
            int width = NSR[i]-NSL[i]-1; 
            ans = Math.max(ans,heights[i]*width);
        }

        return ans;
        
    }
}