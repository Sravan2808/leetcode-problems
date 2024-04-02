class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();

        findAll("(",1,0,result,n);
        return result;
        
    }
    void findAll(String current,int o,int c,List<String> result,int n)
    {
        // store the current string in answer only when its length is 2*n
        if(current.length()==2*n)
        {
            result.add(current);
        }
        if(o<n)
        {
            findAll(current+"(",o+1,c,result,n);
        }
        if(c<o)
        {
            findAll(current+")",o,c+1,result,n);
        }
    }
}