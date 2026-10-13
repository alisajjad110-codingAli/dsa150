package DSA150;

public class Solution {
    //Solution1
    public List<List<String>> groupAnagrams(String str){
        Map<String, List<String>> ans = new HashMap<>();
        
        for(String s : str){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
    
    //Solution2
    public List<List<String>> groupAnagrams(String str){
        Map<List, List<String>> ans = new HashMap<>();
        
        for(String s : str){
            int[] count = new int[26];
            
            //Count frequency of each letter
            for(char c : s.toCharArray){
                count[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder<>();
            for (int num : count){
                sb.append(num).append("#");
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
        
    }
}