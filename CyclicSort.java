import java.util.Arrays ;
public class CyclicSort {
    public static void main(String[] args) {
        
        int[] arr = {4,3,2,7,8,2,3,1} ;
        cyclicsort(arr) ;
        System.out.print(Arrays.toString(arr)) ;
    }
    public static void cyclicsort(int[] arr) {
        int index = 0 ;
        while (index<arr.length) {
            int correct = arr[index] - 1 ;
            if (arr[correct] != arr[index]) {
                swap(arr , correct , index) ;
            } else 
                index++ ;
        }
    }
    
    public static void swap(int[] arr , int correct , int index) {
        int temp = arr[index];
        arr[index] = arr[correct] ;
        arr[correct] = temp ;
        
    }   
}
 