import java.util.*;
import java.util.function.*;

public class FunctionTry {


    private int id;
    private String username;
    private  String favorite_color;


    public FunctionTry (int id, String username, String favorite_color ){
        this.id = id;
        this.username = username;
        this.favorite_color = favorite_color;
    }

    public FunctionTry (){

    }

    public FunctionTry (String favorite_color){
        this.favorite_color = favorite_color;
    }


    @Override
    public String toString() {
        return "FunctionTry{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", favorite_color='" + favorite_color + '\'' +
                '}' + "\n";
    }


    public static void main(String[] args) {


        FunctionTry emp1 = new FunctionTry (1,"cambot", "red");
        FunctionTry emp2 = new FunctionTry (2,"gypsy", "black");
//        FunctionTry emp3 = new FunctionTry (3,"tom", "green");
        FunctionTry emp3 = new FunctionTry();
        emp3.id = 3;
        emp3.favorite_color = "orange";
        FunctionTry emp4 = new FunctionTry (4,"crow", "red");
        FunctionTry emp5 = new FunctionTry (5,"joel", "yellow");
        FunctionTry empEmptyConst = new FunctionTry(); // will print  FunctionTry{id=0, username='null', favorite_color='null'}
        FunctionTry empConstFavCol = new FunctionTry("purple");
        FunctionTry emp6 = new FunctionTry (6,"mike", "red");
        FunctionTry emp7 = new FunctionTry (7,"jonah", "blue");

        FunctionTry[] functionTries = {new FunctionTry(1,"gypsy","red"),
                                       new FunctionTry(2,"joe","yellow"),
                                       emp3, emp4, emp5, empEmptyConst, emp6,empConstFavCol, emp7};
        System.out.println(Arrays.toString(functionTries));

//        FunctionTry emp = new FunctionTry(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7));
//        System.out.println(Arrays.toString(emp1));

    }
}
