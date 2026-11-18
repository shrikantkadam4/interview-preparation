public record RecordClassExample1 (int a, int b){

    public static void main (String[] args){
        RecordClassExample1 recordClassExample1=new RecordClassExample1(1,2);

        System.out.println("a- "+recordClassExample1.a);
        System.out.println("b- "+recordClassExample1.b);
        System.out.println("a, b - " +recordClassExample1.toString());
    }
}
