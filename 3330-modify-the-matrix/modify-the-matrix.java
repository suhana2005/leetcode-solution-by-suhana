class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                mx = Math.max(mx, matrix[i][j]);
            }
            colMax[j] = mx;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }
        return matrix;
    }
}
