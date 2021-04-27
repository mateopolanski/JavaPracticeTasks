public class SumaLiczbZArraysow {

    public static void main(String[] args) {

        int[] myArr = {6 , 42 , 3 , 7};
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("A: " + i);
            sum = sum + myArr[i];

        }
        System.out.println(sum);

        // dodawanie wszystkich elementów arraysów
//=================================================================================================

        int[] myArr2 = {2, 5 , 7 , 9};
        int sumMnozenia=1;
        for (int i = 0; i < myArr2.length; i++) {
//            System.out.println("A: " +sumMnozenia + i);
            sumMnozenia = myArr2[i] * sumMnozenia;

        }
        System.out.println(sumMnozenia);

        // mnożenie elementów arraysów
//=====================================================================================================

        int [] forLoopArray = {2,3,4,5};

        for (int poKolei: forLoopArray) {

            System.out.println(poKolei);
        }

        //forloop
//==============================================================================================


        int [] forLoopArray2 = {9,8,7,6};
        int total=0;
        for (int iteruj: forLoopArray2) {

            total += iteruj;
//            System.out.println("Iteruj: "+ iteruj +"\n"+ "ForLoop2: "+ forLoopArray2 + "\n" +"TOTAL: "+total);
            System.out.println("KONIEC"+total);
        }


        //dodawanie elementów Arrays w FOR Loop!
//==================================================================================================


    }
}
