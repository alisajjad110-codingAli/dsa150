//import java.util.Scanner ;
//import java.lang.Math ;
public class BitwiseOperators {
    
    public static void main(String[] args) {
     /*   Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstnum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondnum = input.nextInt();
        int a = firstnum & secondnum ;
        int b = firstnum | secondnum ;
        int c = firstnum ^ secondnum ;
        int d = ~firstnum ;
        int f = firstnum << secondnum ;
        int e = firstnum >> secondnum ;
        
        System.out.println("Result is: " + a);
        System.out.println("Result is: " + b);
        System.out.println("Result is: " + c);
        System.out.println("Result is: " + d);
        System.out.println("Result is: " + f);
        System.out.println("Result is: " + e);
        */
        
        
    /*    Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table");
        System.out.println("Enter The Number: ");
        int num = input.nextInt();
        int a = 1 ;
        while (a<=20) {
            int b = num*a ;
            a = a+1;
            System.out.println(b);
            
            
        }
        */
        
        
        // Sum of odd no.
        
        
        
        
        
        // Factorial of a number
        
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum Calculator");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("Sum of Odd Numbers is: " + sum);
        
        
        
        
    }
    
    public static int oddsum(int num) {
        int i = 1 ;
        int sum = 0 ;
        while (i<=num) {
            sum = sum + i ;
            i = i + 2 ;
        }
        
        return sum ;
     */
     
     // Factorial of a number
     
   /*  Scanner input = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int num = input.nextInt();
     int fact = factorial(num);
     System.out.println("Factorial is: " + fact);
     
     }
     public static int factorial(int num) {
      while (num<2) {
       return 1 ;
       
      }
      int fact = 1 ;
      int i = 2 ;
       while (i<=num) {
       fact = fact*i ;
       i++ ;
        
       }
      return fact ;
      */
   // Sum of digits of an Integer
    /* Scanner input = new Scanner(System.in);
     System.out.println("Sum of Digits of the Given Integer");
     System.out.print("Enter the Number: ");
     int num = input.nextInt();
     int sum = sumofinteger(num);
     System.out.println("Sum of Digits of an Integer is: " + sum);
     
     
     }
     public static int sumofinteger(int num) {
      int sum = 0 ;
      while (num>0) {
       sum = sum + (num%10) ;
       num = num/10 ; 
       
      }
      return sum ;
     */
     //LCM of two numbers
     
   /*  Scanner input = new Scanner(System.in);
     System.out.println("LCM of two numbers");
     System.out.print("Enter the First number: ");
     int firstnum = input.nextInt();
     System.out.print("Enter the Second number: ");
     int secondnum = input.nextInt();
     int lcm = lcmofnumber(firstnum , secondnum);
     System.out.println("LCM of two numbers is: " + lcm);
     
     
      
     }
     public static int lcmofnumber(int firstnum , int secondnum){
      int i = 1 ;
      while (i<=secondnum) {
       int lcm = 0 ;
       lcm = firstnum*i ;
       i++ ;
       if (lcm%secondnum == 0) {
        return lcm ;
      }
      
       
      } 
      return 0 ;
      */
     
     // GCD of 2 numbers
     // Very Happy 
     // coded run without any external help
     
  /*   Scanner input = new Scanner(System.in);
     System.out.println("GCD of two numbers");
     System.out.print("Enter the first number: ");
     int first = input.nextInt();
     System.out.print("Enter the Second number: ");
     int second = input.nextInt();
     int gcd = gcdofnumbers(first , second);
     System.out.println("GCD of numbers is: " + gcd);
     }
    
     public static int gcdofnumbers(int first , int second){
     int i = second ;
     int gcd = 0 ;
     while (i<=second) {
      gcd = first / i ;
      if (first%i== 0 && second%i==0) {
       return i ;
       
      }
      i-- ;
      
     }
      return 0 ; 
     */
     
     // Reversing digits of a number
     
  /*   Scanner input = new Scanner(System.in);
     System.out.println("Reversing digits of a number");
     System.out.print("Enter the number: ");
     long num = input.nextLong();
     long reverse = reverseofnumber(num);
     System.out.println("Reverse of digit is: " + reverse);
     
     
     }
     
     public static long reverseofnumber(long num){
      long reverse = 0 ;
      while (num>0) {
       long digit = num%10 ;
       reverse = reverse*10 + digit;
       num = num/10 ;
       
       
      }
      
      return reverse ;
     */
     
     // prime number
     
    /* Scanner input = new Scanner(System.in);
     System.out.println("Prime number Checker");
     System.out.print("Enter the number: ");
     int num = input.nextInt();
     boolean prime = isprime(num);
     if (prime) {
      
      System.out.println(num + " is prime number");
     } else {
      System.out.println(num + " is not prime number");
      
     }
     
     
     
     }
     public static boolean isprime(int num) {
      int i = 2 ;
      while (i<num) {
       if (num%i==0) {
        return false ;
       }
       i++ ;
       
      }
      return true ;
     */
     
     // Fibonacci series
     
     /*
     
     Scanner input = new Scanner(System.in);
     System.out.println("Fibonacci Series");
     System.out.print("Enter the number: ");
     int num = input.nextInt();
     series(num) ;
     
    }
     
     public static void series(int num) {
      if (num<0) return ;
       System.out.print("0 ");
      if (num==0) return ;
       System.out.print("1 ") ;
      int first = 0 ;
      int second = 1 ;
      while ((first + second)<=num) {
      int series = first + second ;
       System.out.print(series + " ");
       first = second ;
       second = series ;
       
      } 
      */
     
     // Armstrong number checker
     
     /*
     Scanner in= new Scanner(System.in);
     System.out.println("Armstrong number Checker");
     System.out.print("Enter the number: ");
     int num = in.nextInt();
     boolean armstrong = isArmstrong(num);
     if (armstrong) {
      System.out.println(num + " is Armstrong number");
      
     } else {
      
      System.out.println(num + " is not Armstrong number");
     }
     
      
     
    }
 
    public static boolean isArmstrong(int num) {
     int noofdigits = noOfDigits(num);
     int numcopy = num ;
     int finalresult = 0;
     while (num>0) {
      int digit = num%10 ;
     num = num/10 ;
      
     finalresult += pow(digit , noofdigits) ;
     
     }
     return finalresult == numcopy ;
     
    }
 
    public static int noOfDigits(int num) {
     int d = 0 ;
     while (num>0) {
      num = num/10 ;
      d++ ;
     }
     return d ;
    }
    public static int pow(int num1 , int num2){
     int i = 0 ;
     int result = 1 ;
     while (i<num2) {
      result  = num1*result  ;
      i++ ;
     }
     return result ;
     */
     
     // Palimdrome Number checker
     
   /*  Scanner input = new Scanner(System.in);
     System.out.println("Palindrome number Checker");
     System.out.print("Enter the number: ");
     long num = input.nextLong();
     long palindrome = palindromenumber(num);
     if (palindrome==num) {
      System.out.println(num + " is palindrome");
     } else {
      System.out.println(num + " is not palindrome");
      
     }
     
    }
     public static long palindromenumber(long num){
      long palindrome = 0 ;
      while (num>0) {
       palindrome = palindrome*10 + (num%10);
       
      num = num/10 ;
       
       
       
       
      }
      return palindrome ;
      */
     
   /*  Scanner input = new Scanner(System.in);
     System.out.println("Palindrome number Checker");
     System.out.print("Enter the number: ");
     long num = input.nextLong();
     boolean palindrome = palindromenumber(num);
     if (palindrome) {
      System.out.println(num + " is palindrome");
     } else {
      System.out.println(num + " is not palindrome");
      
     }
     
    }
     public static boolean palindromenumber(long num){
      long numcopy = num ;
      long palindrome = 0 ;
      while (num>0) {
       palindrome = palindrome*10 + (num%10);
       
      num = num/10 ;
       
       
       
       
      }
      return palindrome== numcopy;
      
      */
     
     // Printing Patterns
     
     
     System.out.println("Printing Payterns");
     int rows = 0 ;
     while (rows<5) {
      System.out.print("* ");
      
     }
     int i = 0 ;
     while (i<rows) {
      System.out.print("*");
      i++ ;
      
     }
     System.out.println();
     rows++ ;
      
     
     }
     
 
 
}