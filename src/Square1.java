import java.nio.charset.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Square1 {

    public static int makeSquare (int n){
        return n * n;
    }

    public static boolean isSquare(int n) {

        if (n<0){
            return false;
        }
        else if (n==0){
            return true;
        }
        else {
            double num = Math.sqrt( n );
            double round = Math.round( num );
            return round*round == n ? true: false;

        }
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int example = scan.nextInt();
        System.out.println("Given number is: " +example);
        double check = Math.sqrt( example );
        System.out.println("Math.sqrt: = " +check);
     //   int convert = (int)check;
     //   System.out.println(convert);
        boolean result = isSquare( example );
        System.out.println("Is it square?: " + result);

        String pattern = "\"^\\\\d+\\\\.?\\\\d{0}[^1-9]$\"";
        String pattern2 = "#.#";
        DecimalFormat dc = new DecimalFormat(pattern2);
        Pattern regex = Pattern.compile("^\\d+\\.?\\d{0}[^1-9]$");
        double a = Math.round( check );

        dc.format( check );
        System.out.println("RegEx = " +a);

        System.out.println(makeSquare( 360 ));

    }
}
