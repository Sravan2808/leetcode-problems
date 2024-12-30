class Solution {
    private final int M = 1_000_000_007;

    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] t = new int[high + 1];
        // t[i] = Total number of good strings of length i

        t[0] = 1; // Only one good string ""

        for (int i = 1; i <= high; i++) {
            if (i - zero >= 0) {
                t[i] = (t[i] % M + t[i - zero] % M) % M;
            }
            if (i - one >= 0) {
                t[i] = (t[i] % M + t[i - one] % M) % M;
            }
        }

        int ans = 0;

        for (int l = low; l <= high; l++) {
            ans = (ans % M + t[l] % M) % M;
        }

        return ans;
    }
}