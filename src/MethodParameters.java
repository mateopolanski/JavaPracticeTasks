import java.util.*;

public class MethodParameters {


    private static void sayHello (String name) {

        System.out.println("Hello "+ name);
    }

    public static void main(String[] args) {

        sayHello("Mati");
        sayHello("Adam");
        sayHello("Ambroży");
        sayHello("Michał");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String customName = scanner.nextLine();
        sayHello(customName);

        String modifiedName = "new member";

        sayHello(modifiedName);

    }
}
