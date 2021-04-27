import java.io.*;

class Main {



    public static int dodawanieLiczb(int a) {



        int result = 0;

        while (a > 0) {
            result = result + a % 10;
            a = a / 10;


        }
        return result;
    }

    public static void main(String[] args) {
        int sum = dodawanieLiczb(1234);
        System.out.println("suma liczb: " +sum);

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

//        HashMap map = new HashMap();
//        map.put("vishal" , 20);
//
//        {
//            int hash = 118;
//
//            // {"vishal"} is not a string but
//            // an object of class Key
//            //  Key key = {"vishal"};
//
//            Integer value = 20;
//            Node next = null;
//            System.err.println("haha");


//                Scanner scanner = new Scanner(System.in);
//                int days = scanner.nextInt();
//                int hours = days * 24;
//                int minutes = hours * 60;
//                int seconds = minutes * 60;
//                System.out.println (+days +" days is: " +seconds+ " seconds");
//                //your code goes here

    //        for (int i = 2; i < 10; i = i * i) {
//            System.out.println(i);
//        }
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//        double month=1;
//        double percentage = amount*0.10;
//
//        for (month = 1; month<6; month*=percentage) {
//            month++;
//            System.out.println(month);
//        }

}