public class SumaLiczb {

    public static void main(String[] args) {

        int num = 3219;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("1st method: " +sum);

        for (int i = 0; i < num; i++){
            sum = sum + num % 10;
            num = num/10;
            System.out.println(i);
        }
        System.out.println("2nd method: " +sum);
    }
}
