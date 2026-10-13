package DSA150;

public class MedianFinder {
    
    private PriorityQueue<Integer> minheap = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        minheap.offer(num);
    }
    
    public double findMedian() {
        int size = minheap.size();
        
        PriorityQueue<Integer> tempheap = new PriorityQueue<>();
        
        for (int i = 0; i<(size+1)/2-1 ;i++) {
            tempheap.poll();
        }
        if (size%2 != 0) 
            return (double) temp.poll();
        
        return ((double) (tempheap.poll() + tempheap.poll()))/2;
    }
}

public class MedianFinder2 {
        //maxHeap
        private PriorityQueue<Integer> left = new PriorityQueue<>((a,b) -> b-a);
        //minHeap
        private PriorityQueue<Integer> right = new PriorityQueue<>();
        
        public MedianFinder2 {
            
        }
        
        public void addNum(int num) {
            if (right.isEmpty() && left.isEmpty()) {
                left.offer(num);
            } else if (right.isEmpty()) {
                if (left.peek() > num)
                    left.offer(num);
                
                else 
                    right.offer(num);
            } else if (right.peek() > num)
                left.offer(num);
                else 
                    right.offer(num);
                
                if (right.size() == left.size()+2) 
                    left.offer(right.poll());
                if (right.size() +2 == left.size()) {
                    right.offer(left.poll());
                }
        }
    
    public double findMedian() {
        if (left.size() == right.size()) 
            return (((double) right.peek() + left.peek())/2);
        
        return right.size() > left.size() ? (double)right.peek() : (double)left.peek();
            
    }
        
}