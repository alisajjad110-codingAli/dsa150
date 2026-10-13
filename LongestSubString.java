package DSA150;
import java.util.Arrays;
import java.util.HashSet;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        char[] chararray = s.toCharArray();
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i<chararray.length; i++) {
            seen.add(chararray[i]);
        }
        return seen.size();
        
    }
}