package Cybertek.day64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {

    public static void main(String[] args) {

        // for single row
        // i want to get the value by it's column name
        // so i chose Map

        Map<String,String> row1 = new HashMap<>();
        row1.put("first_name","Regan");
        row1.put("email","rboichat0@1688.com");
        row1.put("gender","Female");

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name","Charley");
        row2.put("email","cmorillas1@blog.com");
        row2.put("gender","Male");
        // for one row i used one Map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        List<Map<String, String>> rowMapsLst = new ArrayList<>();
        rowMapsLst.add(row1);
        rowMapsLst.add(row2);
        System.out.println(rowMapsLst);

        //HOW DO I GET 2ND ROW EMAIL COLUMN VALUE?
        System.out.println("rowMapsLst = " + rowMapsLst.get(1).get("email"));

        // UPDATE THE NAME TO HULK
        rowMapsLst.get(0).replace("first_name","Hulk");
        System.out.println(rowMapsLst);
        rowMapsLst.get(0).replace("first_name","Jane");
        System.out.println(rowMapsLst);



    }
}
