import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationsOfStringCharacters {
    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));
        System.out.println(getPermutations("xyz"));
        System.out.println(getPermutations("xy"));
    }

    public static String getPermutations(String str) {
        Set<String> set = new HashSet<>();
        set.add("");

        for (int i = 0; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            Set<String> updatedSet = new HashSet<>();

            for (String word : set) {
                for (int pos = 0; pos <= word.length(); pos++) {
                    StringBuilder sb = new StringBuilder(word);
                    sb.insert(pos, nextChar);
                    updatedSet.add(sb.toString());
                }
            }
            set = updatedSet;
        }

        return set.stream().sorted().collect(Collectors.joining(","));
    }
}
