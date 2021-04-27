package Threads;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] array = {2 , 1 , 4 , 5 , 6,8};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = i+ sum;

        }
        System.out.println(sum);
    }
}
