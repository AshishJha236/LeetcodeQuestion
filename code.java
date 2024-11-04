//This code is for 2D Matrix to make satisfiable the conditions. 
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
 



// This code for Converting String Into an Integer.
class Solution {
    public static int myAtoi(String s) {
            int len = s.length();
            long num = 0; // Use long to handle overflow before converting to int
            int i = 0;
            long max = Integer.MAX_VALUE;
            long min = Integer.MIN_VALUE;

            // Skip leading whitespace
            while (i < len && s.charAt(i) == ' ') {
                i++;
            }

            // Check for sign
            int negative = 1;
            if (i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                negative = s.charAt(i) == '-' ? -1: 1;
                i++;
            }

            // Build the number
            while (i < len && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;

                // Check for overflow
                if (negative == 1 && num > max) {
                    return Integer.MAX_VALUE;
                }
                
                if (negative == -1 && -num < min) {
                    return Integer.MIN_VALUE;
                }
            }
            // Apply sign
            num = negative== -1? -num : num;

            return (int) num; // Cast to int before returning
    }

}