class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st = new Stack<Integer>();
        int leftSmall[]=new int[n];
        int rightSmall[]=new int[n];

        for(int i=0;i<n;i++)
        {
            // Till we have index with greater height on the stack we will keep removing it
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            // if nothing is left on stack ,we set left boundary as 0
            if(st.isEmpty())
            {
            leftSmall[i]=0;
            }
            else
            {
                // else left boundary is whatever is on top of stack plus 1
                leftSmall[i]=st.peek()+1;
            }
            st.push(i);
        }
        // clear our stack
        while(!st.isEmpty())
        st.pop();

        for(int i=n-1;i>=0;i--)
        {
                while(!st.isEmpty()&& heights[st.peek()]>=heights[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    rightSmall[i]=n-1;
                }
                else{
                    rightSmall[i]=st.peek()-1;
                }
                st.push(i);
        }
                int maxA=0;
                for(int i=0;i<n;i++)
                {
                    maxA=Math.max(maxA,heights[i] * (rightSmall[i] - leftSmall[i]+1));
                }
               
         return maxA;
        
    }
}