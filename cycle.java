import java.util.Arrays ;
public class cycle {
    
    public static void main(String[] args) {
        
        int[] arr = {4,0,2,1} ;
        sort(arr) ;
        System.out.println(Arrays.toString(arr)) ;
        int ans = missingnum(arr) ;
        System.out.println() ;
        System.out.print(ans) ;
    }
    public static void sort(int[] arr) {
        int i = 0 ;
        while (i<arr.length) {
            int correct = arr[i] ;
            if  (arr.length != correct) {
            if (arr[i] != arr[correct]) {
                swap(arr , correct , i) ;
            } else 
                i++ ;
        } else 
            i++ ;
      }
        
        
    }
    public static void swap(int[] arr , int correct , int i) {
        int temp = arr[correct] ;
        arr[correct] = arr[i] ;
        arr[i] = temp ;
        
        
    }
    public static int missingnum(int[] arr) {
        for (int index = 0 ; index<arr.length ; index++) {
            if (arr[index] != index) {
                return index ;
            }
        }
        return -1 ;
    }
    
}