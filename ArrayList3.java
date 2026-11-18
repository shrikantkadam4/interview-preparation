import java.util.ArrayList;

public class ArrayList3{
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("green");
        arrayList.add("red");
        arrayList.add("blue");
        
        arrayList.stream().forEach(System.out::println);
    }
}
