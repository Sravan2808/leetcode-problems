class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int cnt = 0;
        int insertion = 0;
        int i = 0;

        while(i<n){
            if(s.charAt(i)=='('){
                cnt++;
                i++;
            }else if(s.charAt(i)==')'){
                if(cnt>0) cnt--;
                else{
                    insertion++;
                }
                if(i+1<n && s.charAt(i+1)==')') i+=2;
                else{
                    insertion++;
                    i+=1;
                }
            }
        }

        return insertion+cnt*2;

    }
}