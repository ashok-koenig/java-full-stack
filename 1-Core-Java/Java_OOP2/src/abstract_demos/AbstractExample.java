package abstract_demos;

abstract class MyCalss{
    // Concrete method - with implementation
    void concreteMethod(){
        System.out.println("Concrete Method called...");
    }
    // Abstract Method - without implementation
   abstract void abstractMethod();
}

public class AbstractExample extends MyCalss {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method called...");
    }

    public static void main(String[] args) {
        AbstractExample obj = new AbstractExample();
        obj.concreteMethod();
        obj.abstractMethod();
    }
}
