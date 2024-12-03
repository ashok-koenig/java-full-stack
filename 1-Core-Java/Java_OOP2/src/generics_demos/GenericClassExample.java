package generics_demos;
// Generic class creation
class Box<T> {
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}

class Calculator<T extends Number>{
    public double add(T n1, T n2){
        return n1.doubleValue()+n2.doubleValue();
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.setValue("Hello Generic Box");
        System.out.println("String box value: "+ stringBox.getValue());

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setValue(100);
        System.out.println("Integer box value: "+ integerBox.getValue());

        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Integer Sum: "+ intCalc.add(10,20));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Integer Sum: "+ doubleCalc.add(10.454,20.34545));
    }
}
