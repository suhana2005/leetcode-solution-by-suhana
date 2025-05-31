class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;  // Start with a positive sign
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;      // Product will be zero
            if (nums[i] < 0) sign *= -1;     // Flip sign on each negative
        }
        return sign;
    }
}
