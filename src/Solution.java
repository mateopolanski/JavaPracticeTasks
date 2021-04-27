public class Solution {

    //this program sums all NATURAL numbers which is divided by 3 and 5 so 3,5,6,9 and so on...

    public static void main(String[] args) {

        System.out.println(solution( 10 ));
        System.out.println(whileSolution( 10 ));
        System.out.println( "sum 10: " +addNatural( 10 ));
        System.out.println( "sum 9: " +addNatural( 9 ));
        System.out.println( "sum 16: " +addNatural( 16 ));


    }


    public static int solution(int number) {
        //TODO: Code stuff here
        int result = 0;

        if (number > 0) {
            return 0;
        } else {
            if (number == 3 && number == 5 && number == 6 && number ==9){
                for (int i = 3; i <10; i++){
                    result += number;
                }
            } return result;
        }
    }

    public static int whileSolution (int num) {

        int i = 3, sum = 0;


        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
        return sum;
    }

    public static int addNatural (int natural){
        int sum = 0;
        for (int i = 3; i < natural; i++){
            if (i % 3 == 0 || i % 5 ==0) {
                sum = i + sum;

            } System.out.println(sum);

        }   return sum;
    }
}