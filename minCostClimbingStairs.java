public class minCostClimbingStairs {
    public int Solution(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[n+1]; 

        // dp[0] = 0;
        // dp[1] = 0; 
        int prev1 = 0;
        int prev2 = 0;
        int result = prev2;

        for (int i = 2; i<=n; i++) {
            result = Math.min(prev2 + nums[n-1], prev1 + nums[n-2]);

            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }
}