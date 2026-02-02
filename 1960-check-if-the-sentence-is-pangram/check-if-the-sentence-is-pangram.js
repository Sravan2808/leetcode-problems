/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    let set = new Set(sentence);

    if(set.size == 26) return true;
    return false;
    
};