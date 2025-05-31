class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                if (curr == n * n) return moves;

                for (int i = 1; i <= 6; i++) {
                    int next = curr + i;
                    if (next > n * n) continue;
                    int[] pos = getPosition(next, n);
                    int row = pos[0], col = pos[1];
                    int destination = board[row][col] == -1 ? next : board[row][col];
                    if (!visited[destination]) {
                        visited[destination] = true;
                        queue.offer(destination);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private int[] getPosition(int num, int n) {
        int row = n - 1 - (num - 1) / n;
        int col = (num - 1) % n;
        if (((n - row) % 2) == 0) {
            col = n - 1 - col;
        }
        return new int[]{row, col};
    }
}
