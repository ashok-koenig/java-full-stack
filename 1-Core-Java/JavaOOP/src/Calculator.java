// Overloading - Same method name and difference number of parameter / type of parameter
public class Calculator {
    int sum(int n1, int n2){
        return n1+n2;
    }
    // Overloading the sum method with differnet number of parameters
    int sum(int n1, int n2, int n3){
        return  n1+n2+n3;
    }
    // Overloading the sum method with differnt type of parameters
    double sum(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Integer sum with 2 parameters: "+ calc.sum(10,20));
        System.out.println("Integer sum with 3 parameters: "+ calc.sum(10,20,30));
        System.out.println("Double sum with 2 parameters: "+ calc.sum(10.3,20.5));
    }
}
