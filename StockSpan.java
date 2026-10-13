package DSA150;

public class Solution {
    public List<Integer> stockSpan(int[] price) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int prevHigh = -1;
        
        for (int i = 0; i<price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                s.pop();
            }
            
            if (stack.isEmpty()) ans[i] = i+1;
            else ans[i] = i-stack.peek();
            
            stack.push(i);
        }
        
        return ans;
    }
}