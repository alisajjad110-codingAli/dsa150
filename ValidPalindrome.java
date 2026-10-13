package InterviewMaster ;

public class ValidPalindrome {
    
    public static void main(String[] args) {
        String s = "" ;
        String replace = s.replaceAll("[^a-zA-Z0-9]" , "");
        String lowercase = replace.toLowerCase();
        char[] chararray = lowercase.toCharArray();
        boolean ans = isPalindrome(chararray);
        System.out.println(ans);
    }
    
    public static boolean isPalindrome(char[] chararray) {
        int start = 0;
        int end = chararray.length-1;
        
        while (end>=start) {
            if (chararray[start++] != chararray[end--]) {
                return false;
            } 
        }
        
        return true;
        
    }
    
}