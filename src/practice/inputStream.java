package practice;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class inputStream {

    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");
        StringBuilder sb = new StringBuilder();
        InputStreamReader sr = null;
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                sr = new InputStreamReader(inputStream, Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(sr);
                int cp;
                while ((cp = bufferedReader.read()) != -1) {
                    sb.append((char) cp);
                }
                bufferedReader.close();
                sr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (MalformedURLException m) {
            System.out.println(m);
        }
        String string = sb.toString();                 // converting StringBuilder output into String
        ArrayList<Integer> arr = new ArrayList<>();      // array to store ages without keys that are over 50 y/o
        for (String each : string.split(", ")) {     // traverse thorough the String splitting keys and values
            if (each.contains("age")) {
                int age = Integer.parseInt(each.replaceAll("\\D+", ""));
                if (age >= 50) {
                    arr.add(age);
                }
            }
        }
        System.out.println(arr.size());
    }
}