import java.io.*;
import java.util.*;

public class FileReader {


    public static void main(String[] args) {

        final String PATHNAME= "C:\\Users\\Mati\\IdeaProjects\\Brudnopis\\text\\someData.txt";

        File file = new File(PATHNAME);

        if (file.exists()){
            System.out.println(file.getName()+ " exists!" +"\n");

        }
        else System.out.println("File does not exist!");

// declaration if file is existing (boolean)
//=========================================================================
// for Scanner try/catch block is mandatory

// next( ) method returns each word separately
// nextLine ( ) method returns words by "line length" from file

        try {
            File file2 = new File(PATHNAME);
            Scanner scan = new Scanner(file2);
            System.out.println("WIERSZYK:"+"\n");
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File is empty");
        }



    }

}
