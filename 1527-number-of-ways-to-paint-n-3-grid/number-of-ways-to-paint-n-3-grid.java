class Solution {
    static final int M = 1000000007;

    String[] states = {
        "RYG","RGY","YRG","YGR","GRY","GYR",
        "RYR","YRY","GRG","RGR","YGY","GYG"
    };

    Integer[][] dp;

    int solve(int n, int prev) {
        if (n == 0) return 1;
        if (dp[n][prev] != null) return dp[n][prev];

        int result = 0;
        String last = states[prev];

        for (int curr = 0; curr < 12; curr++) {
            if (curr == prev) continue;

            String currPat = states[curr];
            boolean conflict = false;

            for (int col = 0; col < 3; col++) {
                if (currPat.charAt(col) == last.charAt(col)) {
                    conflict = true;
                    break;
                }
            }

            if (!conflict) {
                result = (result + solve(n - 1, curr)) % M;
            }
        }

        return dp[n][prev] = result;
    }

    public int numOfWays(int n) {
        dp = new Integer[n][12];
        int result = 0;

        for (int i = 0; i < 12; i++) {
            result = (result + solve(n - 1, i)) % M;
        }
        return result;
    }
}
