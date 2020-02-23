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

    }
 }