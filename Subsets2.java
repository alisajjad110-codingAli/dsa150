package DSA150;

public class Solution {
    public List<List<Integer>> subsetWithDup(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,subset,ans);
        return ans;
    }
    
    public void backtrack(int i, int[] nums, List<Integer> subset, List<List<Integer>> ans){
        if(i==nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtrack(i+1, nums, subset, ans);
        subset.remove(subset.size()-1);
        
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        backtrack(i+1,nums,subset,ans);
    }
}