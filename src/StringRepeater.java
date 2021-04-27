import java.io.*;

public class StringRepeater {
    public static String repeatStr(final int repeat , final String string) {

        String result = "";
        for (int i = 0; i<repeat; i++) {
        }
            return result;
    }

    public static String repeatMethod (final int repeat , final String string){

         return string.repeat( repeat );

    }
    public static void main(String[] args) {

//        String string = "Mati";
//        int repeat = 4;
//
//        String result = "";
//        for (int i = 0; i <= repeat; i++) {
//            result += string;
//            System.out.println( result );
//        }
//        System.out.println("result is == " +result);

        System.out.println( repeatStr( 3 , "aaaaa" ) );
        System.out.println( repeatStr( 4 , "Mati" ) );
        System.out.println( repeatStr( 5 , "Hello" ) );

        System.out.println(repeatMethod( 3, "Repeat" ));
    }
}

