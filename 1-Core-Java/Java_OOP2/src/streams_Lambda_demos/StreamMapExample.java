package streams_Lambda_demos;

import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40);

        // Divid each numbers with 10 and print
        numbers.stream().map( num-> num /10).forEach(System.out::println);


        List<String> names = List.of("John", "Peter", "Smith", "David", "Jane");

        names.stream().map( name -> name.toUpperCase()).forEach(System.out::println);
    }
}
