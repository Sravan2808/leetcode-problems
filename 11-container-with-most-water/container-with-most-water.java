class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int ans = Integer.MIN_VALUE;
        while(i<j){
            int minheight = Math.min(height[i],height[j]);
            int width = j-i;
            int area = minheight*width;
            ans = Math.max(ans,area);

            if(height[i]>height[j]){
                j--;
            }
            else i++;
        }
        return ans;
        
    }
}