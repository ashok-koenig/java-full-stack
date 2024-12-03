package collection_demos;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "John");
        students.put(102, "Bob");
        students.put(103, "Peter");
        students.put(102, "Smith");
        students.put(104, "John");

        System.out.println("Students Map: "+ students);

        // Accessing with key
        System.out.println("Student with Roll number 101: " + students.get(101));

        for (Map.Entry<Integer, String> entry: students.entrySet()){
            System.out.println("Roll Number: "+ entry.getKey() + " Name: "+ entry.getValue());
        }
    }
}
