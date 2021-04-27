import java.util.*;

public class CreatingFiles {
    public static void main(String[] args) {

        String newData = "C:\\Users\\Mati\\IdeaProjects\\Brudnopis\\text\\someNewData2.txt";
        try{
            Formatter form = new Formatter(newData);
            form.format("%s %s %s %s","1","John", "Smith", "HAHA\r\n");
            form.format("%s %s %s %s %s" ,"2","Mati","Thebesciak","HA","LLAMA");
            form.close();

            //%s String with separate SPACE
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
}
