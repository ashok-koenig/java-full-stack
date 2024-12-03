package generics_demos;

interface Printable<T>{
    void print(T value);
}

class Printer<T> implements Printable<T>{

    @Override
    public void print(T value) {
        System.out.println("Printing: "+ value);
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Printable<String> stringPrinter = new Printer<>();
        stringPrinter.print("Working with Generic Interface.");

        Printable<Integer> integerPrinter = new Printer<>();
        integerPrinter.print(1000);
    }
}
