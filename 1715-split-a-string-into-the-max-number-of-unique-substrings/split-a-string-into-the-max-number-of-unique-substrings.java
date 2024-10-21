class Solution {
    void allPossibleSubStrings(String s ,int pos,int maxCount[],HashSet<String> uniqueSubstring){
        if(pos == s.length()){
            if(maxCount[0]<uniqueSubstring.size()){
                maxCount[0] = uniqueSubstring.size();
            }
            return;
        }
        StringBuilder substring = new StringBuilder();
        for(int i=pos ;i<s.length();i++){
            substring.append(s.charAt(i));

            if(!uniqueSubstring.contains(substring.toString())){
                uniqueSubstring.add(substring.toString());
                allPossibleSubStrings(s,i+1,maxCount,uniqueSubstring);
                uniqueSubstring.remove(substring.toString());
            }
        }
    }
    public int maxUniqueSplit(String s) {
        int maxCount[] = new int[1];
        HashSet<String> uniqueSubstrings = new HashSet<>();
        allPossibleSubStrings(s,0,maxCount,uniqueSubstrings);
        return maxCount[0];
        
    }
}