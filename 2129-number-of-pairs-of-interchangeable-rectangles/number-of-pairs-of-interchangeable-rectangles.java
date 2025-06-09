class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<String, Long> ratioMap = new HashMap<>();
        long count = 0;

        for (int[] rect : rectangles) {
            int width = rect[0];
            int height = rect[1];
            int gcd = gcd(width, height);

            String key = (width / gcd) + "," + (height / gcd);
            count += ratioMap.getOrDefault(key, 0L);

            ratioMap.put(key, ratioMap.getOrDefault(key, 0L) + 1);
        }

        return count;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] rectangles = {{4, 8}, {2, 4}, {4, 8}, {1, 2}};
        System.out.println(sol.interchangeableRectangles(rectangles));  // Output should be 4
    }
}
