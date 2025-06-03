import java.util.*;

public class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        boolean[] hasBox = new boolean[status.length];
        boolean[] hasKey = new boolean[status.length];
        boolean[] opened = new boolean[status.length];
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int box : initialBoxes) {
            hasBox[box] = true;
            queue.offer(box);
        }
        
        int totalCandies = 0;

        while (!queue.isEmpty()) {
            int box = queue.poll();

            if (opened[box] || (!hasKey[box] && status[box] == 0)) {
                continue;
            }

            // Open the box
            opened[box] = true;
            totalCandies += candies[box];

            // Collect keys
            for (int key : keys[box]) {
                hasKey[key] = true;
                if (hasBox[key] && !opened[key]) {
                    queue.offer(key);
                }
            }

            // Collect contained boxes
            for (int contained : containedBoxes[box]) {
                hasBox[contained] = true;
                queue.offer(contained);
            }
        }
        
        return totalCandies;
    }
}
