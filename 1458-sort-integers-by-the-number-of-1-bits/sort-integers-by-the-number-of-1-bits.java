class Solution {
    int bits(int N){
        int cnt = 0;
        for(int i=0;i<32;i++){
            if(((N>>i)&1)==1) cnt++;
        }
        return cnt;
    }
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
              int bits_a = bits(a);
              int bits_b = bits(b);
              if(bits_a==bits_b) return a-b;
              return bits_a-bits_b;
            }
        });

        for(int i=0;i<temp.length;i++){
            arr[i] = temp[i];
        } 
        return arr;       
    }
}