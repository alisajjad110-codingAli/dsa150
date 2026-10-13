package DSA150;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size =  n*n;
        
        HashSet<Integer> seen = new HashSet<>();
        int repeated = -1; int missing = -1;
        
        for (int row : grid) {
            for (int n : row) {
                if (!seen.add(n)) {
                    repeated = n;
                }
            }
        }
        
        for (int num = 1; num<size; num++) {
            if (!seen.contains(num)) {
                missing = num;
                break;
            }
        }
        
        return new int[]{repeated,missing}; 
    }
}

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        nSquare = n*n;
        
        
        long expectedsum = (long) nSquare(nSquare+1) /2;
        long expectedsquare = (long) nSquare(nSquare+1)(2 * nSquare+1)/6;
        
        long actualsum = 0; long actualsquare = 0;
        
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                actualsum += grid[i][j];
                actualsquare += (long) grid[i][j]*grid[i][j] ;
            }
        }
        
        // a-b
        int diffsum = (int)actualsum - expectedsum;
        
        // a² - b²
        int diffsquare = (int)actualsquare -expectedsquare;
        
        // a+b
        int sum = diffsquare/diffsum ;
            
            int a = (sum + diffsum)/2;
            int b = (sum - diffsum)/2;
            
            return new int[]{a,b}; 
        
    }
}