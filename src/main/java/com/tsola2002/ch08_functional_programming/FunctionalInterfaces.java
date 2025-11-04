package com.tsola2002.ch08_functional_programming;

import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        // USING CONSUMER INTERFACE
        // Consumer<String> printer = msg -> System.out.println(msg);
        // printer.accept("Hello From Consumer Interface");

        // USING PREDICATE INTERFACE
        // Predicate<Integer> isEven = n -> n % 2 == 0;
        // System.out.println(isEven.test(9));

        // USING SUPPLIER INTERFACE
//        Supplier<Double> randomValue = () -> Math.random() * 100;
//        System.out.println(randomValue.get());

        // USING A FUNCTION INTERFACE
        // Function<Integer, String> toString = n -> "Number: " + n;
        // System.out.println(toString.apply(50));

        // USING UNARY OPERATOR INTERFACE
        // UnaryOperator<Integer> square = n -> n * n;
        // System.out.println(square.apply(5));

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(7, 3));

    }
}
