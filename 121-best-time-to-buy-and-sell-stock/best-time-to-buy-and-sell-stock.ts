function maxProfit(prices: number[]): number {
    let minElem:number = prices[0];
    let profit:number = 0;
    for(let value of prices){
        minElem = Math.min(minElem,value);
        profit = Math.max(profit,value-minElem)
    }
    return profit
};