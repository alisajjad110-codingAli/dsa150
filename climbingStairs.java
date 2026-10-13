public class climbingStairs {
    public int solution(int n) {
        int[] dp = new int[n];
        for (int i = 0; i<dp.length; i++) {
            dp[i] = -1;
        }
        return helper(n, dp);
    }

    //Using Memoization
    public int helper(int n, int[] dp) {
        if (n == 1 || n ==2) return n;

        if (dp[n] != -1) return dp[n];

        return dp[n] = helper(n-1, dp) + helper(n-2, dp);
    }

    //Using Tabulation

    public int tabulation(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2; 
        for (int i = 3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
}
