class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int digitsum = 0;

        for (int i = 0; i < nums.length; i++){
        elementsum = elementsum + nums[i];

        int current = nums[i];
        while(current > 0)
        {
            digitsum = digitsum + current % 10;
            current = current / 10;
        }

        }
        return Math.abs(elementsum - digitsum);
    }
}