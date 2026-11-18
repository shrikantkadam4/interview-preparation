package creationalDesignPatterns.builderDesignPattern;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Pizza plainPizza =
                new Pizza.PizzaBuilder()
                        .size("small")
                        .build();

        Pizza deluxePizza =
                new Pizza.PizzaBuilder()
                        .size("large")
                        .cheese(true)
                        .pepperoni(true)
                        .mushrooms(true)
                        .build();

        System.out.println(plainPizza);
        System.out.println(deluxePizza);
    }
}
