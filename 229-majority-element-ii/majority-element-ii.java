class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        // TimeComplexity:O(n^2):SC:O(1) BruteForce
    //     for (int i = 0; i < nums.length; i++) {
    //         if (ls.size() == 0 || ls.get(0) != nums[i]) {
    //             int cnt = 0;
    //             for (int j = 0; j < nums.length; j++) {
    //                 if (nums[j] == nums[i]) {
    //                     cnt++;
    //                 }
    //             }
    //             if (cnt > nums.length / 3)
    //                 ls.add(nums[i]);
    //             if (ls.size() == 2)
    //                 break;
    //         }
    //     }
    //     return ls;
    // }

    // Hashing Technique Brute Force TC &Sc:O(n);
    // Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
    // for(int i=0;i<nums.length;i++){
    //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    //     if(mp.get(nums[i])>nums.length/3){
    //         ls.add(nums[i]); 
    //     }
    // }
    // return ls;


    int cnt1=0;
    int cnt2=0;
    int ele1=Integer.MIN_VALUE;
    int ele2=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(cnt1==0 && ele2!=nums[i]){
            cnt1=1;
            ele1=nums[i];
        }
        else if(cnt2==0 && ele1!=nums[i]){
            cnt2=1;
            ele2=nums[i];
        }
        else if(nums[i]==ele1) cnt1++;
        else if(nums[i]==ele2) cnt2++;
        else{
            cnt1--;
            cnt2--;
        }
    }
    cnt1=0;
    cnt2=0;
    for(int i=0;i<nums.length;i++){
        if(ele1==nums[i]) cnt1++;
        if(ele2==nums[i]) cnt2++;
    }
        if(cnt1 >= nums.length/3+1) ls.add(ele1);
        if(cnt2 >= nums.length/3+1) ls.add(ele2);
    return ls;
    }
}