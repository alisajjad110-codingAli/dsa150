package InterviewMaster ;

class Solution {
    public int rob(int[] nums) {
        int money = 0;
        if (nums.length==0) {
            return money;
        }
        
        if (nums.length==2) {
                return Math.max(nums[0] , nums[1]);
            }
        
        if (nums.length==1) {
            return nums[0] ;
        }
        
        for (int i = 0; i<nums.length; i++) {
            
            if (i%2==0) {
                 money += nums[i] ;
            }
           
        }
        
        return money;
    }
}