import java.util.*;

public class SymbolPattern {

    public static void main(String[] args) {

        System.out.println("How many stars to print?: ");
        Scanner scan = new Scanner(System.in);
        int numOfStars = scan.nextInt();
        System.out.println("What Symbol to print?: ");
        char symbol = scan.next().charAt(0);
//        symbol = scan.useDelimiter(".").
//        char symbol = scan.findInLine(".").charAt(0);


        for (int i = 1; i <= numOfStars; i++){
            for (int j = 0; j < i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        for (int i = numOfStars - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }



    }
}
