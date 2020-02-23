package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {


        List<String> allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));

        Map<Integer, String> idNamePair = new HashMap<>();

        //forEach loop
        for (String eachLine : allData) {
            // System.out.println("eachLine = " + eachLine);
            // cutting the String into 2 parts and Parsind first part to number
            // second part saving to String name
            int id = Integer.parseInt(eachLine.split(",")[0]);
            String name = eachLine.split(",")[1];
            idNamePair.put(id, name);
        }
        System.out.println(idNamePair);
        // get an employee with id 20
        System.out.println("idNamePair.get(20)" + idNamePair.get(20));

        // lambda
        //llData.forEach(each -> System.out.println("eachLine : " + each));

        // 1, Lilian --- 1  Lilian
        //String line = "1,Lilian";
//        int id = Integer.parseInt(line.split(",")[0]);
//        String name = line.split(",")[1];
        // System.out.println(id);
        // System.out.println(name);

//        idNamePair.put(id,name);
//        System.out.println("idNamePair = " + idNamePair);
    }
}
