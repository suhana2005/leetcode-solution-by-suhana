import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapST.putIfAbsent(charS, charT) != null && mapST.get(charS) != charT) 
                return false;
            if (mapTS.putIfAbsent(charT, charS) != null && mapTS.get(charT) != charS) 
                return false;
        }

        return true;
    }
}
