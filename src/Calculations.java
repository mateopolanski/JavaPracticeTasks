public class Calculations {


    public static void main(String[] args) {
        int a=1;
        int b=2;
        while (++b<5){
            a *= b;
            System.out.println(a);
        }
        System.out.println("TOTAL: "+a);
    }
}
