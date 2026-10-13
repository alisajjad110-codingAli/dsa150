package Opps;

public class opps1 {
    public static void main(String args[] ) {
        Student kunal = new Student(22 , "kunal" , 88.5f) ;
        Student rahul = new Student() ;
        System.out.println(rahul.name) ;
        System.out.println(kunal.name) ;
    }
}

    
    class Student {
        int age ;
        String name;
        float marks ;
        
        
        
        Student () {
            
        }
        
        Student (int age , String name , float marks) {
            this.age = age ;
            this.name = name ;
            this.marks = marks ;
    }
        
    
    }

    
