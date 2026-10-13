package InterviewMaster;
import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.HashMap;
public class InterviewMaster100 {
    
    public static void main(String args[]) {
        //Question-1 : 2 sum
        
        ArrayList<Integer> list = new ArrayList<>() ;
        
        int[] arr = {2,7,11,15} ;
        int[] nums = {2,7,11,15} ;
        twosum(arr , list ,9) ;
        twoSum(nums , map ,9);
       // System.out.print(list) ;
       System.out.print(Arrays.toString(twoSum));
        
        
    }
    
    public static void twosum(int[] arr , ArrayList<Integer> list , int target) {
        
        for (int i = 0 ; i<arr.length ; i++) {
            int comp = target - arr[i] ;
            for (int j = i+1 ; j<arr.length ; j++) {
                if (comp==arr[j]) {
                    list.add(i) ;
                    list.add(j) ;
                }
            }
        }
        
    }
    
    //Efficient approach:-
    
    public int[] twoSum(int[] nums ,int target) {
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for (int i = 0; i<nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp) , i} ;
            }
            
        }
         return new int[]{-1, -1};
    }
    
    
    
    
    
}