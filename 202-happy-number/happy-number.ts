function isHappy(n: number): boolean {
    let set = new Set();
    while(true){
    let sum = 0;
        while(n>0){
            let digit = n%10;
            sum += digit*digit;
            n = Math.floor(n/10);
        }
        if(sum == 1) return true;
        if(set.has(sum)) return false;
        set.add(sum);
        n = sum;
    }
    
};