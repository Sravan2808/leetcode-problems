class Solution {
    public long subArrayRanges(int[] nums) {
         Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> st3 = new Stack<Integer>();
        Stack<Integer> st4 = new Stack<Integer>();

        int[] NSL = new int[nums.length];
        int[] NSR = new int[nums.length];
        int[] NGL = new int[nums.length];
        int[] NGR = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            while(!st1.isEmpty() && nums[st1.peek()]>nums[i]){
                st1.pop();
            }
            if(!st1.isEmpty()){
                NSL[i] = st1.peek();
            }
            else NSL[i] = -1;
            st1.push(i);
        }

          for(int i=nums.length-1;i>=0;i--){
            while(!st2.isEmpty() && nums[st2.peek()]>=nums[i]){
                st2.pop();
            }
            if(!st2.isEmpty()){
                NSR[i] = st2.peek();
            }
            else NSR[i] = nums.length;
            st2.push(i);
        }

        for(int i=0;i<nums.length;i++){
            while(!st3.isEmpty() && nums[st3.peek()]<nums[i]){
                st3.pop();
            }
            if(!st3.isEmpty()){
                NGL[i] = st3.peek();
            }
            else NGL[i] = -1;
            st3.push(i);
        }

        for(int i=nums.length-1;i>=0;i--){
            while(!st4.isEmpty() && nums[st4.peek()]<=nums[i]){
                st4.pop();
            }
            if(!st4.isEmpty()){
                NGR[i] = st4.peek();
            }
            else NGR[i] = nums.length;
            st4.push(i);
        }

        long ans = 0;
        for(int i=0;i<nums.length;i++){
            long max = (long) (i-NGL[i]) * (NGR[i]-i);
            long min = (long) (i-NSL[i]) * (NSR[i]-i);
            ans += (long) nums[i]*(max-min);
        }

        return ans;
        
    }
}