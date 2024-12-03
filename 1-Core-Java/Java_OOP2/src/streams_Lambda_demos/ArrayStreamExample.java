package streams_Lambda_demos;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {

    static void display(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println("Streams from Array");
        String[] courses = {"HTML", "CSS", "javaScript", "Spring Boot", "Angular"};
        Stream<String> courseStream = Arrays.stream(courses);
        // Assigning a static function to display the stream values.
//        courseStream.forEach(ArrayStreamExample::display);

        // Creating Lambda function to display the stream values.
//        courseStream.forEach(course -> System.out.println(course));

        // Using System.out::println to display the values.
        courseStream.forEach(System.out::println);
    }
}
