import java.util.Scanner ;
public class Array {
    
    public static void main(String[] args) {
      /*  int[] array = {56 , 78 , 90 ,5 , 89};
        int index = 2 ;
        System.out.println(array[0]);
        System.out.println(array[index]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        */
        
      /*  int[] array = {34 ,56 ,76 ,9 ,78} ;
        int index = 0 ;
        while (index < array.length) {
          
          System.out.println(array[index]);
          index++ ;
      
        }
      */
      // Array Searching
      
   /*   Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Array Searching");
      System.out.print("Enter the number: ");
      int num = input.nextInt();
      boolean arraysearched = arraySearching(num) ;
      if (arraysearched) {
        System.out.println("Your Number was found in the array");
      } else {
        System.out.println("Your Number was not found in the array");
      }
      
        
        
    }
     public static boolean arraySearching(int num){
       int[] array = {34 , 56 , 78 ,90 ,89 ,32 , 2 ,5 ,23} ;
       int index = 0 ;
       while (index<array.length) {
         if (num==array[index]) {
           return true ;
         }
         index++ ;
       }
       return false ;
      */
      
      // Array Challenging Problems
      // Q.40
      
      int[] array = {23 , 4 ,67 ,8 ,90 ,86 ,34 , 21} ;
      int index = 0 ;
      double sum = 0 ;
      double average = 0 ;
      while (index<array.length) {
        sum = sum + array[index] ;
        
        index++ ;
      }
      average = sum/array.length ;
      System.out.println("Yours Sum is: " + sum) ;
      System.out.print("Average is: " + average) ;
      
      
      
      
      
      
     }
    
}