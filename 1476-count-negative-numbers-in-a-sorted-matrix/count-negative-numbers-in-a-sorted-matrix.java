class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int[] row : grid) {
            int left = 0, right = cols - 1;
            int firstNegIndex = cols;  

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (row[mid] < 0) {
                    firstNegIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            count += (cols - firstNegIndex);
        }

        return count;
    }
}
