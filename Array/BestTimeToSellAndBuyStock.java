class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
              int profit=prices[i]-buy;
              maxProfit=Math.max(maxProfit,profit);
            }else{
                buy=prices[i];
            }

        }
        return maxProfit;
    }
}
