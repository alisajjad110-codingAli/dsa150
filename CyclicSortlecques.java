import java.util.Arrays ;
import java.util.ArrayList ;

public class CyclicSortlecques {
    
    public static void main(String[] args) {
        // missing no. question
        
        ArrayList<Integer> list = new ArrayList<>() ;
     //   int[] arr = {4,3,2,7,8,2,3,1};
      //  int[] arr = {1,3,4,2,2} ;
        int[] arr = {1,2,2,4} ;
        missmatchnums(arr , list) ;
     //   missingnum(arr , list) ;
     //   int ans = duplicatenums(arr) ;
      //  System.out.println(ans) ;
       System.out.println(Arrays.toString(arr)) ;
       System.out.println(list) ;
        
        
    }
    
    public static void missingnum(int[] arr , ArrayList<Integer> list) {
        int index = 0 ;
        while (index < arr.length) {
            
            int correct = arr[index] - 1 ;
            if (arr[index] != arr[correct]) {
                
                swap(arr , correct, index) ;
                
            } else {
                index++ ;
            }
            
        }
        
        for (int j = 0 ; j < arr.length ; j++) {
            if (j != arr[j] -1 ) {
                list.add(j+1) ;
            }
        }
    }
    
    public static void swap(int[] arr , int correct , int index) {
        int temp = arr[index];
        arr[index] = arr[correct] ;
        arr[correct] = temp ;
    }
    
    // Duplicate no. ques
    
    public static int duplicatenums(int[] arr) {
        int index = 0 ;
        while (index < arr.length) {
            
            int correct = arr[index] - 1 ;
            if (arr[index] != arr[correct]) {
                
                swap(arr , correct, index) ;
                
            } else {
                index++ ;
            }
            
        } 
        for (int j = 0 ; j<arr.length ; j++) {
            if (j != arr[j]-1) {
                return arr[j] ;
            }
            
        }
        
        return -1 ;
        
        
    }
    
    public static void missmatchnums(int[] arr , ArrayList<Integer> list) {
        int index = 0 ;
        while (index<arr.length) {
            int correct = arr[index] - 1 ;
            if (arr[correct] != arr[index]) {
                swap(arr , correct , index) ;
            } else 
                index++ ;
        }
    
    
    for (int j = 0 ; j<arr.length ; j++) {
        if (j != arr[j] - 1) {
            list.add(arr[j]) ;
            list.add(j+1) ;
        }
    }
        
        
    }
}
    
    
    


    