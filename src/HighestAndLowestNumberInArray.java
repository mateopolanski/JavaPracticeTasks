import java.util.*;
import static java.lang.Integer.parseInt;

public class HighestAndLowestNumberInArray {
    public static String highAndLow(String numbers) {

        String[] num = numbers.split( " " );
        String max = num[0];
        String min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (parseInt( max ) <= parseInt( num[i] )) {
                max = num[i];
            } else if (parseInt( min ) >= parseInt( num[i] )) {
                min = num[i];
            }
        } return (max + " " + min);
    }

            public static void main(String[] args) {

//        String [] numArr = {"1","2","3","5"};
//        int len = numArr.length;
//        String result = "";
//        int last = 0;
//        for (int i = 0;i<len; i++){
//            result = numArr[i];
//            last = numArr[i].lastIndexOf( result );
//            System.out.println(result);
//            System.out.println(last);

      String [] strArr = {"1", "2", "5", "2", "40", "32", "54", "12", "-9"};

        int [] intArr = {1,2,-5,-2,40,-32,54,12,-9};
//        Arrays.toString(strArr);

        int max = Arrays.stream( intArr ).max().getAsInt();
        int min = Arrays.stream( intArr ).min().getAsInt();
        System.out.println("MAX is: "+max+", MIN is: "+ min);

                System.out.println();
        String res= highAndLow( "1 2 -5 2 40 32 54 12 -9");
                System.out.println(res);
    }

}