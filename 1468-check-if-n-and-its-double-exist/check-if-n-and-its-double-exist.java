class Solution {
    int bSearch(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public boolean checkIfExist(int[] arr) {
        // TC:O(N^2)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[i]==2*arr[j] && i!=j) return true;
        //     }
        // }
        // return false;

        // HashMap TC:O(N) SC:O(N)
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : arr){
        //     if(map.containsKey(num*2) || (num%2==0 && map.containsKey(num/2)))
        //     return true;
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // return false;
        
        // BinarySearch : O(nlogn)
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j = bSearch(arr,2*arr[i]);
            if(j!=-1 && j!=i) return true;
        }
        return false;

    }
   
}