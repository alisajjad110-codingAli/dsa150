package DSA150;

public class Solution {
    public List<List<String>> solveNQueens(int n){
        List<List<String>> output = new ArrayList<>();
        char[][] nQueen = new char[n][n];
        
        //Fill boards with dots
        for(int i = 0; i<n; i++){
            Arrays.fill(nQueen[i], '.');
        }
        solve(n, output, nQueens, 0);
    }
    
    private void solve(int n, List<List<String>> output, char[][] nQueen, int row) {
        if(row==n){
            List<String> solution = new ArrayList<>();
            
            for (char[] rowArray : nQueens) {
                solution.add(new String(rowArray));
            }
            
            output.add(solution);
            return;
        }
        
        // Try placing in each column of current row
        for (int col = 0; col<n; col++){
            //if current place is safe
            if(isSafePlace(n, nQueens, row, col)){
                //Place Queen
                nQueens[row][col] = 'Q' ;
                //Recursively solve for next row
                solve(n, output, nQueens, row+1);
                //Backtrack
                nQueens[row][col] = '.' ;
            }
        }
    }
    
    public void isSafePlace(int n, char[][] nQueens, int row, int col) {
        //Check if there is any queen in the current position in the same column
        for (int i = 0; i<n; i++){
            if (nQueens[i][col] == 'Q'){
                return false;
            }
        }
        //Check upper-left diagonal for any queen 
        for (int i = row -1; j = col-1; i>=0 && j>=0; i--,j--) {
            if(nQueens[i][j] == 'Q') {
                return false;
            }
        }
        
        for (int i = row -1; j = col+1; i>=0 && j<n; i--,j++) {
            if(nQueens[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}