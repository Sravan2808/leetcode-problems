/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let cnt = 0;
    let set = new Set();
    for(let i=0;i<jewels.length;i++){
        let ch = jewels.charAt(i);
        set.add(ch);
    }

    for(let i=0;i<stones.length;i++){
        if(set.has(stones.charAt(i))) cnt++;
    }
    return cnt;
};