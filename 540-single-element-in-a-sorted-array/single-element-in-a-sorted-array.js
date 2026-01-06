/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function (nums) {
    let l = 0;
    let n = nums.length 
    let r = n-1;
    while (l <= r) {
        let mid = Math.floor(l + (r - l) / 2);
        if ((mid == 0 || nums[mid - 1] != nums[mid]) && (mid == n - 1 || nums[mid] != nums[mid + 1])) return nums[mid];
        let firstOccurence = mid;
        if (nums[mid]!=0 && nums[mid - 1] == nums[mid]) {
            firstOccurence = mid - 1;
        }
        if (firstOccurence % 2 == 0) l = mid + 1;
        else r = mid - 1;
    }
    return -1;

};