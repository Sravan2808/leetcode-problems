class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int activeCnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') activeCnt++;
        }
        List<Integer> inactiveBlocks = new ArrayList<>();

        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                int start = i;
                while(i<n && s.charAt(i)=='0') i++;
                inactiveBlocks.add(i-start);
            }
            else i++;
        }

        int maxSum = 0;
        for(i=1;i<inactiveBlocks.size();i++){
            maxSum=Math.max(inactiveBlocks.get(i-1)+inactiveBlocks.get(i),maxSum);
        }

        return maxSum+activeCnt;
    }
}