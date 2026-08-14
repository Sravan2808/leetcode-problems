class Solution {
    public int maximumLengthSubstring(String s) {
        int n =s.length();
        // int res = 0;
        // for(int left=0;left<n;left++){
        //     int cnt[] = new int[26];
        //     for(int right=left;right<n;right++){
        //         int ch = s.charAt(right)-'a';
        //         cnt[ch]++;
        //         if(cnt[ch]>2) break;
        //         res = Math.max(res,right-left+1);
        //     }
        // }
        // return res;

        // Sliding window
        int res= 0;
        int left= 0;
        int cnt[] = new int[26];
        for(int right=0;right<n;right++){
            int ch = s.charAt(right)-'a';
            cnt[ch]++;
            while(cnt[ch]>2){
                int ch2 = s.charAt(left)-'a';
                cnt[ch2]--;
                left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    
    }
}