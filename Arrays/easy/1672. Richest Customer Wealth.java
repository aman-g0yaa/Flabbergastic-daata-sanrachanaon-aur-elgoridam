class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int n = accounts.length;
        int m = accounts[0].length;
        
        int maxWealth = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                accounts[i][j] += accounts[i][j-1];
            }
            maxWealth = Math.max(maxWealth , accounts[i][m-1]);
        }
        return maxWealth;
    }
}