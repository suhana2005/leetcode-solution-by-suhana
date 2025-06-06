class Solution {
    public String robotWithString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int minChar = 0;

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            stack.push(c);

            
            while (minChar < 26 && count[minChar] == 0) {
                minChar++;
            }

            
            while (!stack.isEmpty() && (stack.peek() - 'a') <= minChar) {
                result.append(stack.pop());
            }
        }

        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
