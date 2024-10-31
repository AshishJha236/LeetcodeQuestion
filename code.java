class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] != grid[i+1][j]){
                    return false;
                }
                
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col-1;j++){
                if(grid[i][j] == grid[i][j+1]){
                    return false;
                }
                
            }
        }
        return true;

        
    }
}