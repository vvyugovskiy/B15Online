package replit.$_151_200;

import java.util.*;

public class MethodsWithString10LameDb_187 {
    public static String lameDb(String db, String op, String id, String data) {
        //A database (DB), in the most general sense, is an organized collection of data. ... In other words, a database is used by an organization as a method of storing, managing and retrieving information.
        //When you work data in databases, you can read, add, edit, delete data.
        //      Lame database.
        //    This method gets 4 strings and returns a string.
        //    This method creates a very basic database interaction.
        //    you can add, edit and remove data from the database.
        //    all this using only String and string methods.
        //    an example database may look like this:
        //    1data#2moredata#3yet more data
        //      if we use split("#") it will turn into an array.

        ArrayList<String> lst = new ArrayList<>(Arrays.asList(db.split("#")));

        String result = "";
        if (op.equals("add")) {
            lst.add(id + data);
        } else if (op.equals("edit")) {
            lst.set(Integer.parseInt(id) - 1, id + data);
        } else if (op.equals("delete")) {
            lst.remove(Integer.parseInt(id) - 1);
        }
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).charAt(0) != '1') {
                result += "#";
            }
            result += lst.get(i);
        }
        return result;
    }//end lameDb

    public static void main(String[] args) {

        System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");
        // returns:  1etsy#2wooden#3spoon#4aaa
        //(since operation is 'add', we added '#4aaa' to the end and return)
        System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");
        // returns:  1test#2bbb#3foo
        //(since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)
        System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");
        // returns:  #2bla#3foo
        System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");
        // returns:  1tst#2bla#3foo
    }
}
