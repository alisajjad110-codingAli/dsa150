package DSA150;

public class Solution {
    public String ReverseString2(String s){
        String[] words = s.trim.split("\\s+");
        StringBuilder res = new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
    
    //Without StringBuilder
    public String ReverseString3(String s){
        String[] word = s.trim.split("\\s+");
        String out = "" ;
        for(int i = word.length;i>0;i--){
            out += word[i] + " " ;
        }
        return out + word[0];
    }
    
}