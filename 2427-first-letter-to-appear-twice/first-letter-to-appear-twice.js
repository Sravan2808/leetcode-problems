/**
 * @param {string} s
 * @return {character}
 */
var repeatedCharacter = function(s) {
    let set = new Set();
    let ans = s.charAt(0);
    for(let i=0;i<s.length;i++){
        let char = s.charAt(i);
        if(set.has(char)){
             ans = char;
             return ans;
        }
        else{
            set.add(char)
        }
    }
    return ans;
    
};