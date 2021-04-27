import java.util.*;

public class HashMaps {

//=====================================
/*
HashMaps - data collection as key and value in pair
HASHMAP -> (key[index] to another object [value])
 */

    public static void main(String[] args) {


        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Mati" , 199);
        points.put("Marek" , 167);
        points.put("Juan" , 189);
        System.out.println(points.get("Juan"));

/*
@HashMapa powyżej!!!!
 */
//========================================================================

        HashSet <String> stringHashSet = new HashSet<>();
        stringHashSet.add("A");
        stringHashSet.add("B");
        stringHashSet.add("C");

        System.out.println(stringHashSet.size());


    }
}

