package DSA150;

public class Solution {
    public List<List<String>> partition(String s){
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    
    public void backtrack(String s, int start, List<String> path, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        //Explore all possible partitions
        for(int end = start+1;end<s.length;end++){
            //check if given string is a palindrome or not
            if(isPalindrome(s,start,end-1)){
                path.add(s.substring(start,end));
                //Recur to find other partitions
                backtrack(s,end,path,result);
                path.remove(path.size()-1);
            }
        }
        
        public boolean isPalindrome(String s, int left, int right){
            while(left<right){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
            }
            return true;
        }
        
        
    }
}