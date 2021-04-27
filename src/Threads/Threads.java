package Threads;

public class Threads extends Thread {

    public void run() {

        System.out.println("Hello");
    }

}

    class MyClass{

        public static void main(String[] args) {

            Threads obj = new Threads();
            obj.start();
            Thread obj2 = new Threads();
            obj2.start();
            obj2.setPriority(10);

        }

    }
