package creationalDesignPatterns.singletonDesignPattern;

public class SingletonDesignPattern {

    private static SingletonDesignPattern singletonDesignPatternInstance;

    public static int a = 1;

    private SingletonDesignPattern() {
    }

    public static SingletonDesignPattern getInstance() {

        if (singletonDesignPatternInstance == null) {
            singletonDesignPatternInstance = new SingletonDesignPattern();
        }

        return singletonDesignPatternInstance;
    }
}