package Threads;

public class mythread extends Thread {
    @Override
    public void run() {

        display();
    }
// synchronized
     synchronized static void display(){

        int x = 0; while(x<10){
            System.out.println(x);
            x++;
            try { Thread.sleep(100);
            }
            catch (InterruptedException e)
            { e.printStackTrace();
            }
        }
    }
}

class program1 {
    public static void main(String[] args){

        mythread t1 = new mythread();
        t1.start();
        mythread t2 = new mythread();
        try {
            t2.sleep(5000);
        t2.start();}
        catch (InterruptedException e){e.printStackTrace();}
        mythread t3 = new mythread();
        t3.start();
        Runnable runnable = ()->
            System.out.println("I am doing smth");

        new Thread(runnable).start();
    }
}
