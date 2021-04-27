import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) temp++;
            }
            if (temp % 2 == 0) ;
            return a[i];

        }
        return -1;
    }

    @Override
    public String toString() {
        return "FindOdd{}";
    }

    public static void main(String[] args) {

        int [] a = {6,1,1,55,55,3,3,4,4,55,6,6,6};

        Arrays.sort(a);
        for (int i = 0, j = 1; i < a.length; i++) {
            if (j < a.length && a[i] == a[j]) {
                i++;
                j = j + 2;
            } else {
                System.out.println( a[i]);
            }
        }
    }
}

