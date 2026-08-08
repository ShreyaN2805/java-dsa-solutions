class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int day = prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<day){
                day = prices[i];
            }else{
                profit = prices[i]-day;
                max = Math.max(max,profit);
            }
        }
        return max;
    }
}
