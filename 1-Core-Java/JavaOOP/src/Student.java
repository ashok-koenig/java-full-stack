// sub class, child class, derived class
public class Student extends Person{
    int mark;
    Student(){
        super();
        mark=0;
    }
    Student(String firstName, String lastName, int age, int mark){
        super(firstName, lastName, age); // Call the parent class constructor.
        this.mark = mark;
    }
    public void introduce(){
        super.introduce(); // Call the parent class method from child calss
        System.out.println("Mark is"+mark);
    }
}
