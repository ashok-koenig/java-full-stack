package exception_demos;

public class ExceptionExample {
    public static void main(String[] args) {
        int n1=10;
        int n2=0;
        int result = 0;
        String str="Welcome";
//        String str=null;
        try{
            System.out.println("String length: "+ str.length());
            if(n2==0){
                //Manually throwing an exception by validating the data
                throw new ArithmeticException("Please check the n2 value");
            }
            result = n1/n2;
            System.out.println("Result: "+ result);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
//            e.printStackTrace();
            result = n1/1;
            System.out.println("Result: "+ result);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Execution finished");
        }
    }
}
