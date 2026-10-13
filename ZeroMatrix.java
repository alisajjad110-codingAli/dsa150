package DSA150;

public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        
        for (int r = 0; r<matrix.length; r++) {
            if (matrix[r][0] == 0) {
                firstRowZero = true;
            }
        }
        
        for (int c = 0; c<matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                firstRowZero = true;
            }
        }
        
        for (int r = 1; r<matrix.length; r++) {
            for (int c = 1; c<matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }
        
        for (int r = 1; r<matrix.length; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c<matrix[0].length; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
        
        for (int c = 1; c<matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r<matrix.length; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
        
        if (firstRowZero) {
            for (int r = 0; r<matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }
        
        if (firstColZero) {
            for (int c = 0; c<matrix.length; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}