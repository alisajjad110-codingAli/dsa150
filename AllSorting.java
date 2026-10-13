import java.util.Arrays ;
public class AllSorting {
    
    //Bubble Sort 
    
    public static void main(String[] args) {
        
        int[] arr = {5,4,3,2,1} ;
  //      bubblesort(arr) ;
  //      selectionsort(arr) ;
        insertionsort(arr) ;
        System.out.println(Arrays.toString(arr)) ;
        
    } 
    
    public static void bubblesort(int[] arr) {
        
        
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0 ; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr , j, j+1) ;
                }
            }
        }
    }
    
    public static void swap(int[] arr , int first , int second ) {
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
        
    }
    
    public static void selectionsort(int[] arr) {
        
        for (int i = 0 ; i<arr.length ; i++) {
            int last = arr.length-i-1 ;
            int maxint = MaxInt(arr , 0 , last) ;
            swap(arr , maxint , last) ;
            
            
        }
        
    }
    
    public static int MaxInt(int[] arr , int start , int end) {
        
        int max = start;
        
        for (int i = 1; i<=end ; i++) {
            if (arr[i] > arr[max]) {
                max=i ;
            }
        }
        
        return max ;
    }
    
    public static void insertionsort(int[] arr) {
        
        for (int i = 0 ; i<arr.length - 1 ; i++) {
            for (int j = i+1 ; j>0 ; j--) {
                
                if (arr[j] < arr[j-1]) {
                    swap(arr , j , j-1) ;
                } 
                     
                
            }
        }
        
    }
    
    
}