/*Paths in Matrix whose sum is divisible by K*/
import java.util.*
class Solution {
    private static final int MOD = 1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][][] = new int[m][n][k];
        int startRem = grid[0][0]%k;
        dp[0][0][startRem] = 1;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++) {
                if (i == 0 && j == 0) continue;
                int val = grid[i][j];

                if (i>0) {
                    for(int r = 0; r<k; r++) {
                        int count = dp[i-1][j][r];
                        if (count != 0) {
                            int newRem = (r+val)%k;
                            dp[i][j][newRem] = (dp[i][j][newRem]+count)%MOD;
                        }
                    }
                }

                if (j > 0) {
                    for(int r = 0; r<k; r++){
                        int count = dp[i][j-1][r];
                        if (count != 0){
                            int newRem = (r + val)%k;
                            dp[i][j][newRem] = (dp[i][j][newRem]+count)%MOD;
                        }
                    }
                }
            }
        }
        return dp[m-1][n-1][0]%MOD;
    }
}
