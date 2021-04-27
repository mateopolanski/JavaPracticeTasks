public class Array {

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};

        System.out.println(arr);


        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                int tempInt = arr[j];
                arr[j] = arr[i];
                arr[i] = tempInt;
                j++;
                System.out.println(i);
            }
        }
    }
}

