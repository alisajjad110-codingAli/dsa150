package DSA150;

class MyStack {
    
    private Queue<Integer> q;
    
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for (int i = 0; i<q.size()-1; i++) {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
    
}

class MyStack2 {
    private Queque<Integer> q1;
    private Queque<Integer> q2;
    
    public MyStack2() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll())
        }
        q1.offer(x);
        
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}