/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let map1 = new Map();
    let map2 = new Map();
    let words = s.split(" ");
    if(pattern.length != words.length) return false;
    for(let i=0;i<pattern.length;i++){
        let p = pattern.charAt(i)
        let w = words[i];

        if((map1.has(p) && map1.get(p)!=w) || (map2.has(w) && map2.get(w)!=p))return false
        map1.set(p,w);
        map2.set(w,p);
    }
    return true
    
};