import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("a");
        hashSet1.add("b");
        hashSet1.add("c");
        System.out.println("hashSet1- "+hashSet1);

        HashSet<String> hashSet = new HashSet<String>();
    }
}
