public class NextPerfectSquare {
    public static long findNextSquare(long sq) {
        if (sq<0)
            return -1;
        long perfect= sq*sq;
        long nextSq = 0;
        for (int i=1; i<perfect;i++ ){

            nextSq += perfect;
            System.out.println(perfect);
        }
        return 0;
    }

    public static void main(String[] args) {
        long sq = 5;
        if (sq<0){
            System.out.println("square is less than zero");
        }

        long perfect= sq*sq;
        double per = Math.sqrt( sq );
        long nextSq = 0;
        for (int i=1; i<perfect;i++ ){

            nextSq += perfect;
            System.out.print(perfect + " ");
        }
        System.out.println(perfect);

    }
}
