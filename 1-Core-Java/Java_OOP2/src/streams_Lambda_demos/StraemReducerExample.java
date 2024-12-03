package streams_Lambda_demos;

import java.util.List;

public class StraemReducerExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b );
        System.out.println("Sum : "+ sum);
    }
}
