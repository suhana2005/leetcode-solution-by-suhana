class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int firstPos = n;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                firstPos = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int firstNonNeg = n;
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= 0) {
                firstNonNeg = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int negCount = firstNonNeg;      
        int posCount = n - firstPos;     

        return Math.max(negCount, posCount);
    }
}
