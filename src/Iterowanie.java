import java.util.*;

public class Iterowanie {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("London");
        cities.add("Warsaw");
        cities.add("New York");
        cities.add("Sydney");
        cities.add("Oslo");

        Iterator<String> iteruj = cities.iterator();
        String wartosc = iteruj.next();
        System.out.println(wartosc);
        String wartosc2 = iteruj.next();
        String wartosc3 = iteruj.next();
        System.out.println(wartosc3);
        System.out.println(iteruj.hasNext());

//===============================================================
/*
      iterators are typical used in loops to have an
      access to corresponding element in the list
*/
//================================================================

        ArrayList <String> sportList = new ArrayList<>(Arrays.asList
                ("Football", "Hockey", "Tennis", "Golf", "Karate"));
        Iterator <String> sportIterate = sportList.iterator();
        System.out.println("Iteration from loop 'sportList': ");

        while (sportIterate.hasNext()){


            String s = sportIterate.next();
            System.out.println(s);

        }


    }
}
