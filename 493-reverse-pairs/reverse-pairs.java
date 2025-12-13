class Solution {
    int mergeSort(int[] nums, int l, int r) {
        int result = 0;
        if (l == r)
            return 0;
        int mid = (l + r) / 2;
        result += mergeSort(nums, l, mid);
        result += mergeSort(nums, mid + 1, r);
        result += merge(nums, l, mid, r);
        return result;
    }

    int merge(int nums[], int l, int mid, int r) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = l; i <= mid; i++) {
            arr1.add(nums[i]);
        }
        for (int i = mid + 1; i <= r; i++) {
            arr2.add(nums[i]);
        }
        int i = 0;
        int j = 0;
        int k = l;
        int cnt = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) > (2L * arr2.get(j))) {
                cnt = cnt + arr1.size() - i;
                j++;
            } else {
                i++;
            }
        }

        i = 0;
        j = 0;
        k = l;
        while (i < arr1.size() & j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                nums[k] = arr1.get(i);
                i++;
                k++;
            } else {
                nums[k] = arr2.get(j);
                j++;
                k++;
            }
        }
        while (i < arr1.size()) {
            nums[k] = arr1.get(i);
            i++;
            k++;
        }
        while (i < arr2.size()) {
            nums[k] = arr2.get(j);
            j++;
            k++;
        }
        return cnt;
    }

    public int reversePairs(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return mergeSort(nums, l, r);
    }
}