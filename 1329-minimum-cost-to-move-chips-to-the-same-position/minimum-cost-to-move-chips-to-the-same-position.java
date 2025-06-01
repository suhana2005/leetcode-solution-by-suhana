public class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        // Count chips at even and odd positions
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Return the minimum of the two counts
        return Math.min(evenCount, oddCount);
    }
}
