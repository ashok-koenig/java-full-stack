package streams_Lambda_demos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Smith", "David", "Jane");
        Stream<String> nameStream = names.stream();
        System.out.println("Streams of names");
        nameStream.forEach(System.out::println);

        List<String> filteredNames = names.stream()
                                    .filter( name -> name.startsWith("J"))
                                    .collect(Collectors.toList());

        System.out.println(filteredNames);

    }
}
