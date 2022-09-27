class Solution {
    public int maxProfit(int[] prices) {
        //Basic funda of this question is that when the price of stock is going down, you let it go             down and when it reaches the bottom, you then buy the stock. And when the price of the              stock is going up, you let it go up and when it reaches peak, you then sell the stock
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += (prices[i] -  prices[i-1]);
            }
        }
        return profit;
    }
}