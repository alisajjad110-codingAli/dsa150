package DSA150;
import java.util.Arrays;
// debug it
public class 4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0; int j = nums.length-1; 
        int left = i+1; int right = j-1;
        while (i<left && right<k) {
            left = i+1; right = j-1;
            while (left<right) {
                int total = nums[i]+nums[j]+nums[left]+nums[right];
                if (total == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    while (left<right && nums[left] == nums[left++]) left++ ;
                    while (left<right && nums[right] == nums[right--]) right-- ;
                    left++ ;
                    right-- ;
                } else if (total<0) {
                    left++ ;
                } else {
                    right-- ;
                }
            }
            i++ ;
            j-- ;
        }
        return list;
        
    }
}