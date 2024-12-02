// Base class, Parent class, Super class
public class Person {
    // Attributes (Fields)
    private String firstName;
    private String lastName;
    public int age;

    // Constructor - Person() {}
    Person(){
        firstName = "";
        lastName = "";
        age = 0;
    }
    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Method
    protected void introduce() {
        System.out.println("My name is " + firstName +" " + lastName + " and age is "+ age);
    }

    public static void main(String[] args) {
        // Creating Object for the class
        Person john = new Person("John", "Peter", 25);
        john.introduce();
        Person baby = new Person();
        baby.firstName = "Ana";
        baby.lastName = "Smith";
        baby.age = 1;
        baby.introduce();
        john.age++;
        john.introduce();
    }
}
