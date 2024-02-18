class Solution {
    public int[] constructRectangle(int area) {
    int sqrt = (int)Math.pow(area,0.5);
    //if it is a perfect square
    if(sqrt*sqrt==area)
    {
        return new int[]{sqrt,sqrt};
    }
    int[] ans=new int[2];
    return rectangle(ans,area,sqrt);
    }
    int[] rectangle(int[] ans,int area,int sqrt)
    {
        if(area%sqrt==0)
        {
            // width
            ans[1]=sqrt;
            // length
            ans[0]=area/sqrt;
            return ans;
        }
        return rectangle(ans,area,sqrt-1);

    }
}