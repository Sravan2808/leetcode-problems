class Solution {
    private int getDigitSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum+n%10;
            n = n/10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer arr[] = new Integer[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            map.put(nums[i],i);
        }
        Arrays.sort(arr,(a,b)->{
            int sum1 = getDigitSum(a);
            int sum2 = getDigitSum(b);
            if(sum1!=sum2) return sum1-sum2;
            else{
                return a-b;
            }
        });
        int swap = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==arr[i]) continue;
            int value = map.get(arr[i]); //nums[] = {18,43,34,16} arr[] = {16,34,43,18}
            int temp = nums[i];
            nums[i] = nums[value];
            nums[value] = temp;
            map.put(nums[i],i);
            map.put(nums[value],value);
            swap++;
        }
        return swap;
    }
}