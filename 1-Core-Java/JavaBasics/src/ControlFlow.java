public class ControlFlow {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        if(num1>num2) {
            System.out.println(num1 + " is greater");
        }else{
            System.out.println(num2 + " is greater");
        }
        byte dayNumber = 1;
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Unknown day Number");
        }

        for (int i=0;i<10; i++){
            System.out.println(i);
        }
        System.out.println("Marks Array using for loop");
        int[] marks = {70, 80,90};
        for (int i=0;i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
