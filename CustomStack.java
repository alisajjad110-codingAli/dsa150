package yoyo ;
    public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10 ;
    
    int ptr = -1 ;
    
    CustomStack () {
        this(DEFAULT_SIZE) ;
    }
        
    CustomStack (int size) {
        this.data = new int[size] ;
    }
    
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full") ;
            return false ;
        }
        ptr++ ;
        data[ptr] = item ;
        return true ;
    }
    
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an Empty Stack!! ") ;
        }
        return data[ptr--] ;
    }
    
    public boolean isFull() {
        return ptr == data.length-1 ;
    }
    
    public boolean isEmpty() {
        return ptr == -1 ;
    }
    public class StackException extends Exception {
        
    public StackException(String message) {
        super(message) ;
        
       }
    }
    
}

   class DynamicStack extends CustomStack {
        public DynamicStack() {
            super() ;
        }
   public DynamicStack(int size) {
        super(size) ;
    }
   
    @Override 
      public boolean push(int item) {
          if (this.isFull()) {
              int[] temp = new int[data.length*2] ;
              for (int i = 0 ; i<temp.length ; i++) {
                  temp[i] = data[i] ;
              }
              data = temp ;
          }
          return super.push(item) ;
          
      }
       
}

     class StackMain {
         
      public static void main(String args[]) throws CustomStack.StackException {
          CustomStack stack = new CustomStack(5) ;
          
          stack.push(89) ;
          stack.push(65) ;
          stack.push(8) ;
          stack.push(9) ;
          stack.push(34) ;
     
      }
         
         
     }

     