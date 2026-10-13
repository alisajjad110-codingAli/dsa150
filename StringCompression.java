package DSA150;

public class Solution {
    public int StringCompression(char[] chars) {
        int ans = 0;
        // iterate through input array using i pointer
        for(int i=0; i<char.length){
            final char letter = chars[i];
            int count = 0;
            
            // Count consecutive occurances of letter in input array
            while(i<char.length; chars[i] == letter){
                count++;
                i++;
            }
            chars[ans++] = letter;
            
            //If count is greater than 1, write count as string in compressed array
            if(count>1){
                // convert count to string and iterate over each character in string
                for(final char c : String.valueOf(count).toCharArray()){
                    chars[ans++] = c;
                }
            }
        }
        
        return ans;
        
    }
    
}