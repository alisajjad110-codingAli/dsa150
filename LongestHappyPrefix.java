package DSA150;

public class Solution {
    public String LongestHappyPrefix(String s) {
        int[] dp = new int[s.length];
        int len = 0, i=1;
        while(i<s.length){
            if(s.charAt(len) == s.charAt(i)){
                dp[i] = ++len;
                i++;
            }
            else {
                if(len>0){
                    len = dp[len-1];
                } else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0,dp[dp.length-1]);
    }
    
}