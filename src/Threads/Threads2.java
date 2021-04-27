package Threads;

class Threads2 implements Runnable {

    private String name;


    Threads2(String name) {
        this.name = name;
        System.out.println("Thread: " + name);
    }

    @Override
    public void run() {
        System.out.println("Hello -> "+name);
    }
}

class MyClassTest {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Threads2("Mati-1"));
        Thread t2 = new Thread(new Threads2("Mati-2"));
        Thread t3 = new Thread(new Threads2("Mati-3"));
        Thread t4 = new Thread(new Threads2("Mati-4"));



        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
