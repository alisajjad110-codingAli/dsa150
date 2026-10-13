public class frogJump {
    public static void main(String[] args) {
        int[] nums = {30, 20, 50, 10, 40};
        System.out.println(minheight(nums));
    }

    public static int minheight(int[] nums) { //time comp: O(N) ; Space comp: O(1)
        int n = nums.length;
        if (n==1) return 0;

        // int[] dp = new int[n]; //min cost to reach last stair i; space comp: O(N)
        // dp[0] = 0;
        // dp[1] = Math.abs(nums[1] - nums[0]);
        int prev1 = 0;
        int prev2 = Math.abs(nums[1] - nums[0]);
        int result = prev2;

        for (int i = 2; i<nums.length; i++) {
            int jump1 = prev1 + Math.abs(nums[i] - nums[i-1]);
            int jump2 = prev2 + Math.abs(nums[i] - nums[i-2]);

            result = Math.max(jump1, jump2);
        }

        return result;
    }
}
