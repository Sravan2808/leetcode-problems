class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum = 0;
        int cnt = 0;
        for (int num : nums) {
            prefSum += num;
                if (prefSum == k)
                    cnt++;
                if (map.containsKey(prefSum - k))
                    cnt += map.get(prefSum - k);
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return cnt;
    }
}