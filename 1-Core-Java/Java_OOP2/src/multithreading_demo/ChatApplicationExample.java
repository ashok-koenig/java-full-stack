package multithreading_demo;

class MessageSender implements Runnable {

    private String message;
    MessageSender(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println("Sending Message: "+ message);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Message sent: "+ message);
    }
}

class MessageReceiver implements Runnable{
    @Override
    public void run() {
        System.out.println("Receiving messages....");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Messages Received.");
    }
}

public class ChatApplicationExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Chat Application");
        Thread sender = new Thread(new MessageSender("How are you?"));
        Thread receiver = new Thread(new MessageReceiver());

        sender.start();
        receiver.start();

        sender.join();
        receiver.join();

        System.out.println("Chat Ends");
    }
}
