package DSA150;

public class Solution {
    public boolean checkValidGrid(int[][] grid){
        if(grid[0][0] != 0) return false;
        return checkValid(grid,0,0,grid.length,0);
    }
    
    public boolean checkValid(int[][] grid, int r, int c, int n, int expectedValue){
        if(r<0 || c<0 || r>=n || c>=n || grid[r][c] != expectedValue){
            return false;
        }
        if(expectedValue == n*n-1) return true;
        
        //Total knight moves are 8
        boolean ans1 = checkValid(grid,r-2,c+1,n,expectedValue);
        boolean ans2 = checkValid(grid,r+2,c+1,n,expectedValue);
        boolean ans3 = checkValid(grid,r-2,c-1,n,expectedValue);
        boolean ans4 = checkValid(grid,r+2,c-1,n,expectedValue);
        boolean ans5 = checkValid(grid,r-1,c-2,n,expectedValue);
        boolean ans6 = checkValid(grid,r-1,c+2,n,expectedValue);
        boolean ans7 = checkValid(grid,r+1,c+2,n,expectedValue);
        boolean ans8 = checkValid(grid,r+1,c-2,n,expectedValue);
        
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
}