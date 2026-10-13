package DSA150;

public class Solution {
    //using sorting
    public int kthSmallest(int[] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n*n];
        int idx = 0;
        
        for (int i = 0; i<n; i++)  {
            for (int j = 0; j<n; j++) {
                arr[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    
    //Priority queue
    
    public int kthSmallest2(int[][] matrix, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        int n = matrix.length;
        
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (p.size() < k) {
                    pq.add(matrix[i][j]);
                } else {
                    if (matrix[i][j] < pq.peek()) {
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        return pq.peek();
    }
    
    //Binary Search
    public int kthSmallest3(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length;
        int lo = matrix[0][0] , hi = matrix[rows-1][cols-1];
        
        while (lo<hi) {
            int mid = lo + (hi-lo)/2;
            int count = 0, maxNum = lo;
            
            for (int r = 0; c = cols-1; r<rows; r++) {
                while (c >= 0 && matrix[i][j] > mid) c--;
                if (c>=0) {
                    count += (count+1);
                    maxNum = Math.max(maxNum, matrix[r][c]);
                } else {
                    break;
                }
            }
            if (k == count) return maxNum;
            else if (count < k) lo = mid+1;
                else hi = mid-1;
        }
        return lo;
    }
}