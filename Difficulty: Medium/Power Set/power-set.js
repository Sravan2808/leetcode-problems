// User function Template for javascript

/**
 * @param {string} s
 * @return {string[]}
 */

class Solution {
    
    solve(s, curr, ans, idx){
        
        if(idx === s.length){
            if(curr.length > 0){
                ans.push(curr.join(""));
            }
            return;
        }
        
        // take
        curr.push(s[idx]);
        this.solve(s, curr, ans, idx + 1);
        
        // remove
        curr.pop();
        
        // not take
        this.solve(s, curr, ans, idx + 1);
    }

    AllPossibleStrings(s) {
        let ans = [];
        this.solve(s, [], ans, 0);
        ans.sort();
        return ans;
    }
}