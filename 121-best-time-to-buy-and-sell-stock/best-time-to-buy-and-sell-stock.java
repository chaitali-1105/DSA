class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n =prices.length;
        int res = 0;
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            res=Math.max(res,prices[i]-min);
        }
    return res;
    }
}