package Threads;

public class Example extends Thread {
    private String name;

    Example(String name) {
        this.name = name; System.out.println(name + " is Created");
    }

    public void run() {
        System.out.println(name + " is Running");
    }
} class Learn {
    public static void main(String args[]) {
        Example E1 = new Example ( "Thread-1");
        Example E2 = new Example ( "Thread-2");
        Example E3 = new Example ( "Thread-3");
        Example E4 = new Example ( "Thread-4");
        E1.start();
        E2.start();
        E3.start();
//        E3.setPriority(10);
        E4.start();
//        E4.setPriority(1);
    }
}