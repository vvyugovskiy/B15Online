package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ListOfMap {

    public static void main(String[] args) throws IOException {

        Map<String, String> e1 = new HashMap<>();
        e1.put("employee_id", "100");
        e1.put("first_name", "Steven");
        e1.put("last_name", "King");
        e1.put("email", "SKING");
        e1.put("salary", "24000");

        System.out.println("e1" + e1);
        List<String> employee2 = Files.readAllLines(Paths.get("employees2"));
        //
        //
        Map<String, String> e2 = new LinkedHashMap<>();
        for (String each : employee2) {
            System.out.println(each);
            String[] arr = each.split("=");
            System.out.println(Arrays.toString(arr));
            e2.put(arr[0], arr[1]);
            System.out.println(e2);
        }

        List<String> employee3 = Files.readAllLines(Paths.get("employees3"));
        Map<String, String> e3 = new LinkedHashMap<>();
        for (String each : employee3) {
            String[] arr = each.split("=");
            e3.put(arr[0], arr[1]);
        }

        List<String> employee4 = Files.readAllLines(Paths.get("employees4"));
        Map<String, String> e4 = new LinkedHashMap<>();
        for (String each : employee4) {
            String[] arr = each.split("=");
            e4.put(arr[0], arr[1]);
        }

        System.out.println("e1 = "+ e1);
        System.out.println("e2 = "+ e2);
        System.out.println("e3 = "+ e3);
        System.out.println("e4 = "+ e4);

        List<Map<String,String>> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        System.out.println("Employee List" + employeeList);






    }
}
