class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int len = word.length();
            int position = word.charAt(len - 1) - '1'; // Convert last char to 0-based index
            result[position] = word.substring(0, len - 1); // Remove the digit
        }

        return String.join(" ", result);
    }
}
