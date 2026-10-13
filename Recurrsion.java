
public class Recurrsion {
    public static void main(String[] args) {
    /*    int n = 5;
        System.out.print(factorial(n)) ;
    }
    
    public static int factorial(int n) {
        if (n==0) {
            return 1 ;
        }
        return n * factorial(n-1) ;
        */
        
        // Sum of digits of a number
        /*
        int n = 1342 ;
        int ans = sumdigits(n) ;
        System.out.print(ans) ;
        
    }
    public static int sumdigits(int n) {
        
        if (n==0) {
            return 0 ;
        }
        
        return (n%10) + sumdigits(n/10) ;
        */
        
        // Product of digit
        /*
        int n = 1342 ;
        int ans = productdigits(n) ;
        System.out.print(ans) ;
        
    }
    public static int productdigits(int n) {
        
        if (n%10==n) {
            return n ;
        }
        
        return (n%10) * productdigits(n/10) ;
        
        
        
        int n = 1824 ;
        int ans = Reversenum(n);
        System.out.print(ans) ;
    }
    
    public static int Reversenum(int n) {
        int sum = 0 ;
        if (n==0) {
            return  ;
        }
        sum = sum * 10 ;
        int ans = (n%10) + sum  ;
        
        
        Reversenum(n/10) ;
        return ans ;
        
        // do palindrome question
        */
        
        // Count zero 
        
        // Doubt 
        // try to debug it
        /*
        
        int n = 30204 ;
        int ans = countzero(n) ;
        System.out.print(ans) ;
        
    }
    
    public static int countzero(int n) {
        int count = 0 ;
        if (n==0){
            return count;
        }
        int rem = n%10 ;
        if (rem==0) {
            count++ ;
        }
        countzero(n/10) ;
        return count ;
        
        // try to solve your doubt using chatgpt
        */
        
        // Kunal 
        
        
    }
    
    
    
}