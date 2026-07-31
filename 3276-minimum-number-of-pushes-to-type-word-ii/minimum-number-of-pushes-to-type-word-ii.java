class Solution {
    public int minimumPushes(String word) {
        Integer map[] = new Integer[26];
        Arrays.fill(map,0);
        for (char ch : word.toCharArray()) {
            map[ch - 'a']++;
        }


        // Convert this descending order according to the frequency
        Arrays.sort(map, (a,b)->b-a);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            int freq = map[i];
            ans += freq * (i / 8 + 1);
        }
        return ans;
    }
}