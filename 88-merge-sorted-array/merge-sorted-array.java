class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] filteredArray = Arrays.copyOfRange(nums1, 0, m);
    int i=0;int j=0;int k=0;
    while(i<m && j < n){
        if(filteredArray[i] < nums2[j]){
            nums1[k] = filteredArray[i];
            k++;
            i++;
        }
        else{
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
        while(i<m){
            nums1[k] = filteredArray[i];
            k++;
            i++;
        }
        while(j<n){
            nums1[k] = nums2[j];
            k++;
            j++; 
        }
        
    }
}