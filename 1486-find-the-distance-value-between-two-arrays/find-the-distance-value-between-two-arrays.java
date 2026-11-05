class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for(int x:arr1){
        boolean flag = false;  
        for(int y:arr2){
            if(Math.abs(x-y)<=d) flag = true;
        }
        if(!flag) cnt++;
        }
        return cnt;
    }
}