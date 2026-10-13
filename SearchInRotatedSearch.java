package DSA150;

public class Solution{
    public int SearchInRotatedSearch(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target) return mid;
            
            //check if left half is sorted
            if (nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>=target){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            //check if right half is sorted
        } else {
            if(target>nums[mid] && nums[mid]<=end){
                start = mid+1;
            }else{
                end = mid-1;
            }
          }
        }
        return -1;
    }
}
