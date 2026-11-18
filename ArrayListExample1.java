import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1-" + list1);
        System.out.println(list1.get(2));
        list1.remove(2);
        System.out.println("list1-" + list1);

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        System.out.println("list2-" + list2);
        try {
            list2.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        List<Integer> list3 = List.of(4, 5, 6);
        System.out.println("list3-" + list3);
        try {
            list3.add(4);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);

        }

        List<Integer> list4 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println("list4-" + list4);
        list4.add(7);
        System.out.println("list4-" + list4);

        List<Integer> list5 = new ArrayList<>(List.of(4, 5, 6));
        System.out.println("list5-" + list5);
        list5.add(7);
        System.out.println("list5-" + list5);
    }
}
