class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < n; i++)
            cnt += s.charAt(i) - '0';
        if (cnt < k)
            return "";

        int left = 0;
        int ones = 0;
        String ans = s;
        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1')
                ones++;
            while (ones > k || s.charAt(left) == '0') {
                ones -= s.charAt(left) - '0';
                left++;
            }
            if (ones == k) {
                String temp = s.substring(left, right + 1);
                if (temp.length() < ans.length() || (temp.length() == ans.length() && temp.compareTo(ans) < 0))
                    ans = temp;
            }
        }
        return ans;
    }
}