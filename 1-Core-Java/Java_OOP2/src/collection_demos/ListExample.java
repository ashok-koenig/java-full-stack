package collection_demos;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // String Array List
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits List: "+ fruits);

        // Accessing an element
        System.out.println("First Fruit: "+ fruits.get(0));
        // Integer Array List
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers list: " + numbers);
        System.out.println("Number of Elements: "+ numbers.size());

        Integer sum =0;
        for(Integer num: numbers){
            System.out.println(num);
            sum +=num;
        }
        System.out.println("Sum is "+ sum);
    }
}
