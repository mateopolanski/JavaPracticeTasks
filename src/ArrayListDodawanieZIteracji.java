import java.util.*;

public class ArrayListDodawanieZIteracji {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(i);
            System.out.println(list);
        }
        int x = 0;
        Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            x += iterator.next();
        }
        System.out.println(x);

    }

}
