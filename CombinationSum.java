package DSA150;

public class Solution {
    //By Backtracking
     public List<List<Integer>> combinationSum(int[] candidates, int target){
         List<List<Integer>> ans = new ArrayList<>();
         backtrack(candidates, target, 0, new ArrayList<>(), ans);
         return ans;
     }
    
    public void backtrack(int[] arr, int remain, int idx, List<Integer> path, List<List<Integer>> ans){
        //if remaining is zero, then we have found avalid combination
        if (remain==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        //if we have used all candidates or remaining target==0
        if(idx==arr.length || remain<0){
            return;
        }
        path.add(arr[idx]);
        backtrack(arr, remain-arr[idx],idx,path,ans);
        
        //remove last added element
        path.remove(path.size()-1);
        
        backtrack(arr,remain,idx+1,path,ans);
        
    }
    
    //By Dp
}