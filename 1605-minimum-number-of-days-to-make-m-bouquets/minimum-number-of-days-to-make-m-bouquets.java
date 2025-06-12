class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;
        int left = 1, right = 0;
        for (int d : bloomDay) right = Math.max(right, d);

        while (left < right) {
            int mid = left + (right - left) / 2, bouquets = 0, flowers = 0;
            for (int d : bloomDay) {
                if (d <= mid) {
                    if (++flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else flowers = 0;
            }
            if (bouquets >= m) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
