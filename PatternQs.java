
public class PatternQs {
    public static void main(String[] args) {
        
       // patterns5(9) ;
        patterns28(9) ;
        
        // DO this question by kunal's approch
        // lec-: patterns 20:00 
        
    }
    public static void patterns4(int n) {
        
        for (int rows = n ; rows>0; rows--) {
            for (int col = 1 ; col<=rows ; col++) {
                System.out.print("* ");
            }
            System.out.println() ;
        }
        
    }
    
    public static void patterns5(int n) {
        
        for (int rows = 0; rows<n ; rows++) {
            if (rows<=n/2) {
                for (int col = 0 ; col<=rows ; col++ ) {
                    
                    System.out.print("* ") ;
                    
                }
                System.out.println() ;
            } else {
                for (int col = 1 ; col<= (n-rows) ; col++) {
                    System.out.print("* ") ;
                }
                System.out.println() ;
            }
                
            
        }
        
    }
    public static void patterns28(int n) {
        
        for (int rows = 0; rows<n ; rows++) {
            int noofcols = rows ;
            if (rows<=n/2) {
                for (int s=0 ; s<=n/2 - noofcols ; s++) {
                        System.out.print(" ") ;
                    }
                    
                for (int col = 0 ; col<=noofcols ; col++ ) {
                    
                    System.out.print("* ") ;
                    
                }
                System.out.println() ;
            } else  {
                
                
                for (int s=0;  s<= rows - n/2 ; s++) {
                        System.out.print(" ") ;
                    }
                        
                for (int col = 1 ; col<= (n-rows) ; col++) {
                    
                    System.out.print("* ") ;
                }
                System.out.println() ;
                // try to debug this question
            }
                
            
        }
        
    }
    
    
    
    
}