import java.util.Arrays;
import java.util.List;

public class GenerateCombinationsBetwenArrayLists {
    public static void main(String[] args){
        List<String> l1= Arrays.asList("A","B","C");
        List<String> l2= Arrays.asList("E","F","G");

        l1.stream()
                .flatMap(l1Word -> l2.stream()
                        .map(l2Word -> l1Word + " - " + l2Word))
                .forEach(System.out::println);
    }
}
