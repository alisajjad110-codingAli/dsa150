import java.util.Scanner ;
public class ArraySearching {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Array Searching");
        Scanner input = new Scanner(System.in);
        int[] array = {23 ,45 ,67 ,89 ,56 ,12 , 90 ,87} ;
        int num = input.nextInt();
        System.out.print("Enter the Number you want to search: ");
        arraysearching(num);
    }
    public static int arraysearching(int num) {
        int index = 0 ;
        while (index<array.length) {
            if (num==array[index]) {
                return 
            }
            
        }
    }
    
}