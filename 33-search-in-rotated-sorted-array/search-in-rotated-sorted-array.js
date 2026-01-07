/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {

    let l = 0;
    let r = nums.length - 1;
    while (l <= r) {
        let mid = Math.floor(l + (r - l) / 2)
        // If target == ele return mid
        if (nums[mid] == target) return mid;

        // if the mid in the check it is in part1 or part2
        // if it in the part-1 check target is in the part1
        // if it is in the part1 then BinarySearch else it is part2 l =mid+1;
        if(nums[mid]>=nums[0]){
            if(target>=nums[0]){
                if(nums[mid]==target) return mid;
                else if(nums[mid]>target) r=mid-1;
                else l=mid+1;
            }
            else l=mid+1;
        }
        else{
            if(target<nums[0]){
                if(nums[mid]==target) return mid;
                else if(nums[mid]>target) r=mid-1;
                else l=mid+1;
            }
            else r=mid-1;
        }   
    }
    return -1;

}
    