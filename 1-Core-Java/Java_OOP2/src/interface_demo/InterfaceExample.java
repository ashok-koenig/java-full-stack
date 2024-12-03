package interface_demo;

interface Calculator{
    int add(int n1, int n2);
    int sub(int n1, int n2);
    int mul(int n1, int n2);
    default void welcome(){
        System.out.println("This is a default method in interface");
    }
}

public class InterfaceExample implements Calculator{
    @Override
    public int add(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    public static void main(String[] args) {
        Calculator calc = new InterfaceExample();
        calc.welcome();
        System.out.println("Sum :"+ calc.add(10,20));
        System.out.println("Sub :"+ calc.sub(10,20));
        System.out.println("Mul :"+ calc.mul(10,20));
    }
}
