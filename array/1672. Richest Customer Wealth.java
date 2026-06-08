// Problem : 1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest=Integer.MIN_VALUE;
        int wealth=0;
        for(int i=0; i<accounts.length; i++){
            wealth=0;
            for(int j=0; j<accounts[0].length; j++){
                wealth+=accounts[i][j];
            }
            if(wealth>richest){
                richest=wealth;
            }
        }
        return richest;
    }
}