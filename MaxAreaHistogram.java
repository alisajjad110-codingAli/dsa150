package DSA150;

public class Solution {
    public int MaxAreaHistogram(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    int maxArea = 0;
    
    for(int i=0;i<heights.length;i++){
        while(stack.peek != -1 && heights[i] <= heights[stack.peek()]) {
            int height = heights[stack.pop()];
            int width = i-stack.peek()-1;
            maxArea = Math.max(maxArea, height*width);
        }
        stack.push(i);
     }
        while(stack.peek() != -1){
            int height = heights[stack.pop];
            int width = height.length-stack.peek-1;
            maxArea = Math.max(maxArea,height*width);
        }
        
        return maxArea;
    }
    
    public static int MaxAreaHistogram1(int[] heights){
        if (height==null || height.length=0) {
            return 0;
        }
        
        int[] lessFromLeft = new int[height.length];
        int[] lessFromRight = new int[height.length];
        lessFromLeft[0] = -1;
        lessFromRight[height.lenght-1] = height.length;
        
        for (int i = 1; i<height.length; i++) {
            int p = i-1;
            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }
        
        for (int i = height.lenght-2; i>=0; i--) {
            int p = i+1;
            
            while (p < height.length && height[p]>=height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }
        
        int maxArea = 0;
        for (int i = 0; i<height.lenght;i++) {
            maxArea = Math.max(maxArea, height[i]*(lessFromRight-lessFromLeft-1));
        }
        return maxArea;
    }
}