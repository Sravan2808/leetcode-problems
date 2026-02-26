/**
 * @param {string} s
 * @return {number}
 */
var numSteps = function(s) {
    let carry = 0;
    let cnt = 0;
    for(let i=s.length-1;i>0;i--){
        if((s[i]-'0'+carry)%2!=0){
            cnt+=2;
            carry=1
        }
        else cnt+=1
    }
    return cnt+carry;
    
};