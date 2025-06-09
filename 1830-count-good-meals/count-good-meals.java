import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countPairs(int[] deliciousness) {
        final int MOD = 1_000_000_007;
        Map<Integer, Integer> countMap = new HashMap<>();
        int result = 0;
        
        for (int d : deliciousness) {
            for (int power = 1; power <= (1 << 21); power <<= 1) {
                result = (result + countMap.getOrDefault(power - d, 0)) % MOD;
            }
            countMap.put(d, countMap.getOrDefault(d, 0) + 1);
        }
        
        return result;
    }
}
