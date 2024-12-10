class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int mat[][] = new int[26][n+1];
        char prevChar = s.charAt(0);
        int length = 0;

        for(int i=0;i<n;i++){
            char currChar = s.charAt(i);
            if(currChar == prevChar){
                length+=1;
                mat[currChar-'a'][length] += 1;
            }
            else{
                length = 1;
                mat[currChar-'a'][length] += 1;
                prevChar = currChar;
            }
        }
        int res = -1;
        for(int i=0;i<26;i++){
            int sum = 0;
            for(int j=n;j>=1;j--){
                sum += mat[i][j];
                if(sum>=3){
                    res = Math.max(res,j);
                    break;
                }
            }
        }
        return res;
    }
}