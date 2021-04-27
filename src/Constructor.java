import java.util.*;

public class Constructor {

    private String majsterName;
    private int height;
    private double salary;

    public String getMajsterName() {
        return majsterName;
    }

    public void setMajsterName(String majsterName) {
        this.majsterName = majsterName;
    }

    public Constructor(){
        this.setMajsterName("Marek");
    }

    @Override
    public String toString() {
        return "Constructor {" + "majsterName= '" + majsterName + '\'' + ", height= " + height + ", salary= " + salary + '}';
    }

    public Constructor (String majsterName , int height, double salary){

        this.majsterName = majsterName;
        this.height = height;
        this.salary= salary;

    }

    public static void main(String[] args) {

        Constructor constructor1= new Constructor();
        System.out.println(constructor1.getMajsterName());
        System.out.println(constructor1);

        Constructor constructor2 = new Constructor("Gienio", 170, 2300.50);
        System.out.println(constructor2);
        constructor1.setMajsterName("Henio");
        constructor2.setMajsterName("Wiesio");
        System.out.println(constructor1);
        System.out.println(constructor2);

        Scanner scanner1 = new Scanner(System.in);;
        System.out.println("Enter name of Constructor: ");
        String data1 = scanner1.nextLine();
        System.out.println("Enter name of height: ");
        int data2;
        do {data2= scanner1.nextInt();}
        while (data2 < 1 || data2 > 210);
        System.out.println("Enter salary");
        double data3 = scanner1.nextDouble();

        Constructor constructor3= new Constructor(data1, data2, data3);

        System.out.println("\n" + "Congratulations, You created following constructor: " +constructor3);

    }

}
