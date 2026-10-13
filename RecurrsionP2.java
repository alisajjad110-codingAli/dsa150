import java.util.ArrayList ;
public class RecurrsionP2 {
    public static void main(String[] args) {
        /*
        int[] arr = {1,2,7,3,4} ;
        boolean ans = sort(arr , 0) ;
        System.out.print(ans) ;
    }
    
    public static boolean sort(int[] arr , int i) {
        
        if (arr.length-1 == i){
            return true ;
        }
        
        if (arr[i]<arr[i+1] && sort(arr , i+1)) {
            return true ;
        } else
            return false ;
        */
        
        int[] arr = {1,2,3,4,4,8} ;
        
        System.out.print(returnarray(arr , 4 , 0 , new ArrayList<Integer>() ) );
        
    }
    
    public static ArrayList<Integer> returnarray(int[] arr , int target , int index , ArrayList<Integer> list) {
        
        if (index == arr.length-1) {
            return list ;
        }
        if (arr[index] == target) {
            list.add(index) ;
        }
        return returnarray(arr , 4 , index+1 , list) ;
    }
    
    // Do linear seach using recurrsion
    
}