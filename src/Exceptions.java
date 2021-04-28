public class Exceptions {

    public static void main(String[] args) {

//        int [] array = new int[2];
//
//        System.out.println(array[5]);
//    }
//

/*
 *      code above will throw an exception
 *      solution how to handle it is below...
 */

//-------------------------------------------------------


          try{
            int [] array = new int[3];
            System.out.println(array[5]);
        } catch (Exception ex) {
              System.out.println("Array out of bounds");
          }
    }

 /*
  *     proper handling of an exception @up
  */
//-------------------------------------------------------
}
