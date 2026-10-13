package DSA150;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i<matrix.length; i++) {
            if (target <= matrix[i][matrix[0].length]-1) {
                int s = 0; int e = matrix[0].length-1;
                
                while (s<=e) {
                    int mid = s+(e-s)/2 ;
                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        s = mid+1;
                    } else {
                        e = mid-1;
                    }
                }
                
                
            }
            
        }
        return false;
    }
}