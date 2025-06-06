class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = -1;
        int rowIndex = -1;

        for (int i = 0; i < mat.length; i++) {
            int countOnes = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                rowIndex = i;
            }
        }
        return new int[] {rowIndex, maxOnes};
    }
}
