import java.util.*;

public class Pozyczka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your loan: ");
        int amount = scanner.nextInt();
        //your code goes here


        int initial =(amount * 10/100);
        int after1Month = amount - initial;
        int tmp = after1Month;

        int after2Month =(tmp * 10/100);
        int afterMonth2 = tmp - after2Month;
        int tmp2 = afterMonth2;

        int after3Month =(tmp2 * 10/100);
        int afterMonth3 = tmp2 - after3Month;
        int tmp3 = afterMonth3;


//


        System.out.println("Remaining 💵 after 1st month " +tmp);
        System.out.println("Remaining 💵 after 2nd month: "+tmp2);
        System.out.println("Remaining 💵 after 3rd month: "+tmp3);



    }

}
