import java.util.HashMap;

public class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> count = new HashMap<>();
        int ans = 0;
        boolean hasCenter = false;

        // Count occurrences of each word
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        // Iterate through the map to form pairs
        for (String word : count.keySet()) {
            String rev = new StringBuilder(word).reverse().toString();

            if (word.equals(rev)) {
                // Handle palindrome words (e.g., "aa")
                ans += (count.get(word) / 2) * 4; // Each pair contributes 4 to the length
                if (count.get(word) % 2 == 1) {
                    hasCenter = true; // One palindrome can be placed in the center
                }
            } else if (count.containsKey(rev)) {
                // Handle non-palindrome words
                int pairs = Math.min(count.get(word), count.get(rev));
                ans += pairs * 4; // Each pair contributes 4 to the length
                count.put(word, count.get(word) - pairs);
                count.put(rev, count.get(rev) - pairs);
            }
        }

        // If there's a possibility of a center element, add 2 to the length
        if (hasCenter) {
            ans += 2;
        }

        return ans;
    }
}
