class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=1;
        int mp= 0;

        while(r<prices.length){
          if(prices[l]<prices[r]){
          mp= Math.max(mp, prices[r]-prices[l]);
          }else{
            l=r;
          }
          r++;
        }
        return mp;
    }
}
