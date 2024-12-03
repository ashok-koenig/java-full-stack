package collection_demos;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Bob");
        names.add("John");

        System.out.println("Names set: "+ names);

        for (String name: names){
            System.out.println("Name: "+ name);
        }
    }
}
