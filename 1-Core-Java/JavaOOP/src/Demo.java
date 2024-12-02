public class Demo {
    public static void main(String[] args) {
        // Class and object with access modifier
//        Person john = new Person("John", "Peter", 25);
//        john.introduce();
//        john.age++;
//        john.introduce();

        // Inheritance with Student class

        Student john = new Student("John", "Peter", 13, 89);
        john.introduce();

        Teacher ana = new Teacher("Ana", "Smith", 27, "English");
        ana.introduce();
    }
}
