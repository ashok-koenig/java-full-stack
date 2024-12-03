import java.util.Scanner;

// Thread creation method 1 by extending the Thread Class
class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread is running.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name "+ name);
    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println("MyThread1 is running.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main Process");
        MyThread t = new MyThread();
        t.start(); // start the thread.
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
