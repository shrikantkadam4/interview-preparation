import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        // Sample input array from Example 1
        String[] words = {"Error", "Alaska", "Dad", "Peace"};

        // Step 1: Build the character-to-row lookup map (0, 1, or 2)
        int[] letterToRowMap = new int[26];
        String row0 = "qwertyuiop";
        String row1 = "asdfghjkl";
        String row2 = "zxcvbnm";

        for (char ch : row0.toCharArray()) letterToRowMap[ch - 'a'] = 0;
        for (char ch : row1.toCharArray()) letterToRowMap[ch - 'a'] = 1;
        for (char ch : row2.toCharArray()) letterToRowMap[ch - 'a'] = 2;

        List<String> validWordsList = new ArrayList<>();

        // Step 2: Loop through and validate each word line-by-line
        for (String word : words) {
            // Find the targeted keyboard row based on the first character
            int targetRow = letterToRowMap[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean isValid = true;

            // Verify if all remaining characters match the target row
            for (int i = 1; i < word.length(); i++) {
                int currentRow = letterToRowMap[Character.toLowerCase(word.charAt(i)) - 'a'];
                if (currentRow != targetRow) {
                    isValid = false;
                    break; // Break the inner loop early on validation failure
                }
            }

            // If the word passed the validation loop, save it
            if (isValid) {
                validWordsList.add(word);
            }
        }

        // Step 3: Convert the dynamic list back to an array and print the result
        String[] result = validWordsList.toArray(new String[0]);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
