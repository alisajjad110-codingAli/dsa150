package DSA150;

public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length){
            return "";
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for(char ch : t.toCharArray){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }
        
        int targetCharRemaining = t.length;
        int startIndex = 0;
        int[] minWindow = {0,Integer.MAX_VALUE};
        
        for(int endIndex = 0; endIndex<s.length; endIndex++){
            char ch = s.toCharArray(endIndex);
            if(charCount.containsKey(ch)){
                targetCharRemaining--;
            }
            
            charCount.put(ch, countChar.getOrDefault(ch,0)-1);
            
            if(targetCharRemaining == 0){
                while(true){
                    char chAtStart = s.toCharArray(startIndex);
                    if(charCount.containsKey(chAtStart) && charCount.get(charAtStart) == 0){
                        break;
                    }
                    charCount.put(chAtStart, charCount.getOrDefault(chAtStart,0)+1);
                    startIndex++;
                }
                
                if(endIndex - startIndex < minWindow[1]-minWindow[0]){
                    minWindow[0] = startIndex;
                    minWindow[1] = endIndex;
                }
                charCount.put(s.tocharArray(startIndex), charCount.getOrDefault(s.tocharArray(startIndex),0)+1);
                targetCharRemaining++;
                startIndex++;
            }
            
        }
        return minWindow[1] >= s.length()? "" : s.substring(minWindow[0], minWindow[1] + 1);
    }
    
    // Solution2 more optimized
    
    public String minWindow2(String s, String t){
        if (s == null || t == null || t.length == 0 || s.length == 0
            s.length < t.length){
                return new String();
            }
        
        int[] map = new int[128];
        int count = t.length;
        int start = 0, end = 0, minLength = Integer.MAX_VALUE,startIndex=0;
        
        for (char c : s.toCharArray){
            map[c]++;
        }
        
        char[] chS = s.toCharArray();
        
        while (end < s.length){
            if (map[chS[end++]]-- > 0){
                count--;
            }
            while (count == 0){
                if(end-start < minLength){
                    startIndex = start;
                    minLength = end - start;
                }
                
                if(map[chS[start++]]++ == 0){
                    count++;
                }
            }
        }
        return minLength = Integer.MAX_VALUE ? new String() :
        new String(chS,startIndex,minLength);
    }
    
}