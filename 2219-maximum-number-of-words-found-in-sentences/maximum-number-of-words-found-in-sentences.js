/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let max = -1;
    for(let i=0;i<sentences.length;i++){
        let words = sentences[i];
        let arr = words.split(" ");
        max = Math.max(max,arr.length);
    }
    return max;
    
};