package office_hours.Practice_2020_02_13;

public class ExceptionsPractice_Throws {

    public static void main(String[] args) throws Exception {

        System.out.println("Step 1");

        Thread.sleep(4000);
        //System.out.println("Step 2" + 9/0);

        System.out.println("Step 3");

        System.out.println("Step 4");

        Thread.sleep(4000);
        System.out.println("Step 5");
    }

    public static void method1() throws Exception {
        main(new String[]{"A"});

    }

    public static void method2() {
        try {
            method1();
        } catch (Exception e) {

        }
    }

    public static void mathod3() {

        // method2();
    }

}
