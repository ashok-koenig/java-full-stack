public class Calculator {
    int num1;
    int num2;
    int result = 0;
    void add(int n1, int n2){
        result = n1 + n2;
    }

    int multiply(int n1, int n2){
        return n1 * n2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(100,200);
        System.out.println("Result is "+ calc.result);
//        int product = calc.multiply(10,10);
//        System.out.println("Product is "+ product);
        System.out.println("Product is "+ calc.multiply(10,10));
    }
}
