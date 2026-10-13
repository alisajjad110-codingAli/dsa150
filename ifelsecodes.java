import java.util.Scanner;
public class ifelsecodes {
    
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        if (number > 0)  {
            System.out.println("Number is Positive");
            
        }else if (number == 0) {
            System.out.println("Then Number is Niether Negative nor Positive ");
        }else {
            System.out.println("Number is Negative");
            
        }    
        
        // Odd Even checker
        
        Scanner input = new Scanner(System.in);
        System.out.println("Odd Even Checker");
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if (num%2== 0) {
            System.out.println("Given number is Even");
            
        } else {
            System.out.println("Given number is Odd");
        }
        
        
        // Greatest of 3 numbers
        
        Scanner input = new Scanner(System.in);
        System.out.println("To check greatest of three numbers");
        System.out.println("Enter the three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a >= b && a >= c) {
            System.out.println(a + " is the  greatest number");
            
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the  greatest number");
            
        }
        */
        
        // Leap year 
        
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year checker");
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if (year%4 == 0 && year%100 != 0 ){
        System.out.println(year + " is a Leap Year");
        }else if (year%100 == 0 && year%400 == 0) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
            
        }
        */
        /*
        // Grades marks
        Scanner input = new Scanner(System.in);
        System.out.println("Grades Based on Marks");
        System.out.println("Enter the percentage marks: " + '%');
        double percentage = input.nextDouble();
        if (percentage >= 90) {
            System.out.println("Yours Grade is: " + 'A');
            
        } else if (percentage < 90 && percentage >= 75) {
            System.out.println("Yours Grade is: " + 'B');
        
        } else if (percentage>= 60 && percentage<75) {
            System.out.println("Yours Grade is: " + 'C');
        
        } else if (percentage>= 30 && percentage<60) {
            System.out.println("Yours Grade is: " + 'D');
        
        } else if (percentage< 30) {
            System.out.println("Yours Grade is: " + 'F');
        }  
        */
        
        // Age groups
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Age Group Checker");
        System.out.println("Please Enter Your Age in years: ");
        int Age = input.nextInt();
        if (Age >= 60) {
            System.out.println("You are a Senior");
            
        } else if (Age < 60 && Age >= 20) {
            System.out.println("You are An Adult");
        
        } else if (Age >= 13 && Age<20) {
            System.out.println("You are in Teen Age Group");
        
        } else if (Age > 0 && Age<13) {
            System.out.println("You are a Child");
        
        }
        
    }
    
}