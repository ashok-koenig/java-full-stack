public class Welcome {
    // Instance Variable
    String course = "Java Full Stack";
    static String company = "Koenig Solutions";

    void display(){
        System.out.println(course);
        System.out.println("Company:" + company);
    }
    public static void main(String[] args) {
        // Local Variable
        String fullName = "John peter";
        System.out.println("Welcome to Java Programming");
        System.out.println("Welcome "+ fullName);

        // Create an object to Welcome class
        Welcome obj = new Welcome();
        // Access the instance variable using object
        System.out.println("Course: "+ obj.course);

        // Calling an instance method
        obj.display();

        // Access the static variable using class name
        System.out.println("Company:" + Welcome.company);
    }
}
