package DSA150;

class MinStack {
    //Space Complexity : O(N)
    Stack<Integer> s = new Stack<>(), st = new Stack<>();
    
    public void push(int val) {
        s.push(val);
        if (st.isEmpty() || val <= st.peek()) st.push(val);
    }
    
    public void pop() {
        if (s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    
    public int top() {
        return s.isEmpty() ? -1 : s.peek;
    }
    
    public int getMin() {
        return st.isEmpty() ? -1 : st.peek();
    }
}

O(N)
class MinStack {
    Stack<Integer> s = new Stack<>();
    long minVal;
    
    public void push(int val) {
        if (s.isEmpty()) {
            s.push((long)val);
            minVal = val;
        } else if (val < minVal) {
            s.push(2L*val-minVal);
        minVal = val;
        }
        else s.push((long)val);
    }
    
    public void pop() {
        long t = s.pop();
        if (t<minVal) minVal = 2*minVal - t;
    }
    
    public int top() {
        long t = s.peek;
        return t < minVal ? (int)minVal : (int)t;
    }
    
    public int getMin() {
        return (int)minVal;
    }
}

class MinStack {
    private List<int[]> st;
    
    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        int top = st.isEmpty() ? new int[]{val,val} : st.get(st.size()-1);
        int minval = top[1];
        if (minval>val) {
            minval = val;
        }
        st.add(new int[]{val,minval});
    }
    
    public void pop() {
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.isEmpty ? -1 : st.get(st.size()-1)[0];
    }
    
    public int getMin() {
        return st.isEmpty ? -1 : st.get(st.size()-1)[1];
    }
}