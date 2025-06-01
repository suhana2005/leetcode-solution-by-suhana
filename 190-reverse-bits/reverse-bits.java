public class Solution {
    // You need to treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;           // Shift result to the left to make room for the next bit
            result |= (n & 1);      // Add the least significant bit of n to result
            n >>>= 1;               // Unsigned right shift n to process the next bit
        }
        return result;
    }
}
