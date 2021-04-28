import java.util.Scanner;

public class BinaryConverter {


    public static String toBinary(int num) {

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;

        }
        return binary;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the whole number to convert it to binary: ");
        int x = sc.nextInt();
        String bin = BinaryConverter.toBinary(x);
        System.out.print(bin);

        System.out.println("\n"+ "Binary " +toBinary(111));
    }
}
