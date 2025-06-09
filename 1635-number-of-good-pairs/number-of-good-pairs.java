import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (freq.containsKey(num)) {
                count += freq.get(num);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
