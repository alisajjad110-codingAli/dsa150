public class houseRobber2 {
    public int Solution(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }

    public int helper(int[] nums, int s, int e) {
        int n = nums.length;
        int[] dp = new int[n-1];

        dp[0] = nums[s];
        dp[1] = Math.max(nums[s], nums[s+1]);

        for (int i = s+2, j=2; i<=e; i++, j++) {
            dp[j] = Math.max(dp[j-1], dp[j-2]+nums[i]);
        }

        return dp[n-2];
    }

    //Space Optimized Approach
}
