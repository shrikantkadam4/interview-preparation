import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountOfEachString1 {
    public static void main(String[] args){
        List<String> givenStrings=Arrays.asList("java","spring","kafka","java");
        Map<String, Long> stringCount= givenStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("String Count- "+stringCount);
    }
}
