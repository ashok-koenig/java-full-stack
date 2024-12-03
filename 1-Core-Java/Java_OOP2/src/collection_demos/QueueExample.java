package collection_demos;

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("Tasks queue: "+ tasks);

        // Process Task
        while(!tasks.isEmpty()){
            System.out.println("Processing: "+ tasks.poll());
        }
    }
}
