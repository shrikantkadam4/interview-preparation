import java.util.*;

public class FindDuplicateCharacters1 {
    public static void main(String[] args){
        String givenCharacters="java";
        Set<String> tempSet=new HashSet<>();
        List<String> duplicateCharacters=
                Arrays.stream(givenCharacters.split(""))
                        .filter(c -> !tempSet.add(c))
                        .distinct()
                        .toList();

        System.out.println("Duplicate Characters- "+duplicateCharacters);
    }
}
