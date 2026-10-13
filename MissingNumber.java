package InterviewMaster ;

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            int correct = nums[i];
            if (nums.length != correct) {
            if (i!=correct) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else 
                i++ ;
            } else 
                i++ ;
        }
        for (int index = 0; index<nums.length; index++) {
            if (index!=nums[index]) {
                return index ;
            }
        }
        return nums.length;
        
    }
}