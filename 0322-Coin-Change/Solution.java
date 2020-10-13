/// Source : https://leetcode-cn.com/problems/coin-change/
/// Author : chenlin
/// Time   : 2020-10-13
/// Updated: 2020-10-13

// dynamic programming
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i = 0;i<dp.length;i++){
            dp[i] = amount+1;
        }
        dp[0] = 0;
        for(int i = 0;i < dp.length;i++){
            for(int coin: coins){
                if(i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1+dp[i-coin]);
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}
