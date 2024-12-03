package streams_Lambda_demos;

import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Smith", "David", "Jane");

        System.out.println("In Ascending order");
        names.stream().sorted().forEach(System.out::println);

        System.out.println("In Descending order");
        names.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);
    }
}
