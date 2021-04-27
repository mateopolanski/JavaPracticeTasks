import java.util.*;

public class SpinWords {
    /*Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).

    Strings passed in will consist of only letters and spaces.
    Spaces will be included only when more than one word is present.
    Examples:

    spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
    spinWords("This is a test") => "This is a test"
    spinWords("This is another test") => "This is rehtona test"
    */

    public static String solution (String sentence) {

        StringBuilder build = new StringBuilder();
        String[] split = sentence.split(  "\\s+" );
        for (String word : split) {
            if (word.length() >= 4) {
                build.append( new StringBuilder( word ).reverse().toString() + " ");
            } else {
                build.append( word + " " );
            }
        }
        return build.toString().trim();
    }


    public static void main(String[] args) {
        String word = solution( "Mati" );
        System.out.println("a: " + word);
        String word2 = solution( "Mat" );
        System.out.println("b: " + word2);
        String word3 = solution( "Mat is amazing" );
        System.out.println("C: " + word3);

        String s = "This is a sample sentence";
        String[] words = s.split("\\s+");
        System.out.println("s" + Arrays.toString( words ) );
    }
}

