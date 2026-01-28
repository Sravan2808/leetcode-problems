/**
 * @param {string[]} names
 * @param {number[]} heights
 * @return {string[]}
 */
var sortPeople = function(names, heights) {
    let map = new Map();
    for(let i=0;i<names.length;i++){
        map.set(heights[i],names[i]);
    }
    heights.sort((a,b)=>b-a)

    let res = [];

    for(let height of heights){
        res.push(map.get(height))
    }

    return res;
    
    
};