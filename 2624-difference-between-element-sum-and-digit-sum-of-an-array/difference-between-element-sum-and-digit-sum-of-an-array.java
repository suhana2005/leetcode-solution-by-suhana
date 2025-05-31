class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum = elementSum + nums[i];

            int current = nums[i];
            while (current > 0) {
                digitSum = digitSum + current % 10;
                current = current / 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}
