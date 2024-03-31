class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> curr=new ArrayList<>();
        result.add(curr);

        for(int num:nums){
            int n=result.size();
            for(int j=0;j<n;j++){//copying the previous subset from previous iteration
                List<Integer> temp=new ArrayList<>(result.get(j));
                temp.add(num);//adding current number in all the previous subsets
                result.add(temp);//add it,back to the result
            }
        }
        return result;
    }
}