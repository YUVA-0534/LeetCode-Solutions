class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int small=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-small;
            if(profit>maxprofit){
                maxprofit=profit;
            }
            if(small>prices[i]){
                small=prices[i];
            }
        }
        return maxprofit;
    }
}
class MaxProfit{
    public static void main(String args[]){
        Solution s=new Solution();
        int a[]={7,1,5,3,6,4};
        System.out.println(s.maxProfit(a));
    }
}