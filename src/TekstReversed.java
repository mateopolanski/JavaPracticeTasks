import java.util.*;

public class TekstReversed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }



        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        System.out.println(sb.reverse());




        System.out.println(arr);

    }


}
