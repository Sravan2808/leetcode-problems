class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int cnt=0;
        int ans[]=new int[A.length];
        if(A[0]==B[0]){
            cnt++;
             ans[0]=cnt;
        }
        else{
        hmap.put(A[0],hmap.getOrDefault(A[0],0)+1);
        hmap.put(B[0],hmap.getOrDefault(B[0],0)+1);
        }
        for(int i=1;i<A.length;i++){
            if(A[i]==B[i])
            cnt++;
            else{
                if(hmap.containsKey(A[i]))
                cnt++;
                if(hmap.containsKey(B[i]))
                cnt++; 
            }
            ans[i]=cnt;
            hmap.put(A[i],hmap.getOrDefault(A[i],0)+1);
            hmap.put(B[i],hmap.getOrDefault(B[i],0)+1);
        }
        return ans;
    }
}