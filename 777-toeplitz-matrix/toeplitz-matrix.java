class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] != matrix[r - 1][c - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
