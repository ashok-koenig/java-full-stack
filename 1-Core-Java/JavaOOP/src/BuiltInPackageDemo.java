import java.util.Scanner;

public class BuiltInPackageDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Name is "+name);

        System.out.println("Enter your course");
        String course = scanner.nextLine();
        System.out.println("Course is "+course);
    }
}
