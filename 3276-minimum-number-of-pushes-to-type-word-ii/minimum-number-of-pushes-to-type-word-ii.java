class Solution {
    public int minimumPushes(String word) {
        int map[] = new int[26];
        for (char ch : word.toCharArray()) {
            map[ch - 'a']++;
        }

        // Convert int to Integer Object we use Streams;
        Integer mapInteger[] = Arrays.stream(map).boxed().toArray(Integer[]::new);

        // Convert this descending order according to the frequency
        Arrays.sort(mapInteger, (a,b)->b-a);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            int freq = mapInteger[i];
            ans += freq * (i / 8 + 1);
        }
        return ans;
    }
}