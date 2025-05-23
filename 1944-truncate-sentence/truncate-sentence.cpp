class Solution {
public:
    string truncateSentence(string s, int k) {
        int count = 0;  // used to count number of spaces
        string result = "";

        for (char c : s) { 
            if (c == ' ') { //Checks if the current character is a space. A space indicates the end of a word
                count++;
                if (count == k) //if we each the k-th letter the loop want to break
                    break;
            }
            result += c;
        }

        return result;
    }
};

/* If s = "Hello how are you Contestant" and k = 4:

count = 0, result = ""

Characters added: H, e, l, l, o → result = "Hello"

c == ' ' → count = 1, result = "Hello "

how → result = "Hello how"

c == ' ' → count = 2, etc.

When count reaches 4, loop breaks, result contains "Hello how are you"

*/
