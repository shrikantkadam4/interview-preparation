package creationalDesignPatterns.singletonDesignPattern;

public class SingletonDesignPatternUser {

    public static void main(String[] args) {

        SingletonDesignPattern singletonDesignPattern1 =
                SingletonDesignPattern.getInstance();

        System.out.println(singletonDesignPattern1.a);

        SingletonDesignPattern singletonDesignPattern2 =
                SingletonDesignPattern.getInstance();

        System.out.println(singletonDesignPattern2.a);

        System.out.println("Do singletonDesignPattern1 and singletonDesignPattern2 refer to the same object-" + (singletonDesignPattern1 == singletonDesignPattern2));

    }
}