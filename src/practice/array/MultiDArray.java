package practice.array;

public class MultiDArray {
    public static void main(String[] args) {

        // FOR LOOP
        int[][] data = {{12, 5, 4}, {23, 113, 32}};
        for (int i = 0; i < data.length; i++) {
            System.out.println("*******Row : " + i);

            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j] + " ");

            }
            System.out.println();

//            // FOR EACH LOOP
//
//            int[][] data1 = {{12, 5, 4}, {23, 113, 32}};
//            for (int[] rows : data1) {
//                System.out.println("*******Row : ");
//                for (int columnData : rows) {
//                    System.out.println(columnData + " ");
//                }
//                System.out.println();
//            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        int maxOne = 6;
        int maxTwo = 5;

        for (int each : arr) {
            if (each > maxOne) {
                maxTwo = maxOne;
                maxOne = each;
            } else if (each > maxTwo) {
                maxTwo = each;
            }
        }
        System.out.println("maxOne | " + maxOne);
        System.out.println("maxTwo | " + maxTwo);


        int[] arr1 = {-6, -5, 3, 1, 8, -7, 2, -4};

        int minOne = 0;
        int minTwo = 0;

        for (int each : arr1) {
            if (each < minOne) {
                minTwo = minOne;
                minOne = each;
            } else if (each < minTwo) {
                minTwo = each;
            }
        }
        System.out.println("minOne | " + minOne);
        System.out.println("minTwo | " + minTwo);
    }
}