class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        for(int x:nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
            set.add(x);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}