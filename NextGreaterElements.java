package DSA150;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for (int i = 0; i<n; i++) {
            res[i] = -1;
            for (int step = 1; i<n; step++) {
                int idx = (i+step)%n;
                if (nums[idx] > nums[i]) {
                    res[i] = nums[idx];
                    break;
                }
            }
        }
        return res;
    }
    
    public int[] nextGreaterElements2(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for (int i = 0; i<n; i++) {
            res[i] = -1;
        }
        
        for (int i = 0; i<n*2; i++) {
            while (!stack.isEmpty() && nums[stack.peek] < nums[i%n]) {
                res[stack.pop()] = res[i%n];
            }
            if (i<n) {
                stack.push(i);
            }
        }
        return res;
    }
}