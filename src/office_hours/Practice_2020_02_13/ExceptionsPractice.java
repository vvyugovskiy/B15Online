package office_hours.Practice_2020_02_13;

public class ExceptionsPractice {

    public static void main(String[] args) {

        String str = "Batch15";
        try {
            char ch1 = str.charAt(10);  // unchecked exception
            System.out.println(ch1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bound");
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        // int a 9/0;
        System.out.println("Test Completed");

        printHello();
    }

    public static void printHello() {
        try {
            Thread.sleep(3000);
            System.out.println("Hello");
        } catch (Exception e) {

        }
    }
}

/*

Step 1
Step 2
Step 3
Step 5
Step 6

 */