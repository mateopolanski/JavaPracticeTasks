import java.time.*;
import java.util.*;
import java.util.stream.*;

public class ListyObjekty {

    public static void main(String[] args) {


        ArrayList<String> imie = new ArrayList<>(1);
        imie.add("Mati");
        imie.add("Natala");
        imie.add("Agata");
        imie.add("Martyna");
        imie.add("Iga");
        imie.add("Mati");

        System.out.println(imie);

        for (String i : imie)
            System.out.println(i.concat(" Byk"));


//====================================================
        LinkedList<String> kot = new LinkedList<>();
        kot.add("Perski");
        kot.add("Tygrys");
        kot.addAll(imie);
        kot.remove("Natala");
        System.out.println("\n" + kot);


        for (String k : kot) {
            System.out.println(k.toLowerCase());
        }


        Collections.reverse(imie);
        System.out.println("NA ODWRÓT: "+imie);



        Collections.sort(imie);
        System.out.println("SORTOWANIE: "+ imie);
        Collections.reverse(imie);
        System.out.println("NA ODWRÓT2: "+imie);

        Collections.shuffle(imie);
        System.out.println("Randomowo: "+imie);

    /*
    For a program with large number of inserts and
    deletions is better to use LinkedList< >
     */


        Instant start = Instant.now();
// CODE HERE
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start , finish).toMillis();
        System.out.println(timeElapsed);


    }
//================================================
}
