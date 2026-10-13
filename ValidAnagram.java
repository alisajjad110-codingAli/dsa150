package DSA150;

public class Solution {
    public boolean ValidAnagram(String s, String t){
        if (s.length != t.length) {
            return false;
        }
        Map<Character,Integer> counter = new HashMap<>();
        
        for(int i = 0;i<s.length,i++){
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<t.length;i++){
            char ch = t.charAt(i)
            if(!counter.containsKey(ch) || counter.get(ch) == 0){
                return false;
            }
            counter.put(ch,counter.get(ch)-1);
        }
        return true;
    }
    
    public boolean ValidAnagram2(String s, String t){
        if(s.length!=t.length) return false;
        
        char[] counter = new int[26];
        
        for (int i =0;i<s.length;i++){
            counter[s.charAt(i) - 'a'] += 1;
        }
        
        for(int i =0;i<t.length;i++){
            if(counter[t.charAt(i) - 'a'] == 0){
                return false;
            }
            counter[t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
    
    public boolean ValidAnagram3(String s, String t){
        if (s.length!=t.length) return false;
        
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        
        for(int i=0; i<s.length; i++){
            sCount.put(s.charAt(i),1 + sCount.getOrDefault(s.charAt(i),0));
            tCount.put(t.charAt(i),1 + tCount.getOrDefault(s.charAt(i),0));
        }
        return sCount.equals(tCount);
    }
    
}