package practice.loop;

public class NestedLoop {
    public static void main(String[] args) {

        // 1.  nested loop
        // for (int i = 0; i < 4; i++) {
        //    System.out.println();

        //    for (int j = 0; j < 3; j++) {
        //        System.out.print("|Row" + i+"-Column" + j);
        // }

        // 2. for each loop

        //   }

        // int[] cols = {1,2,3};
        // int[] rows = {1,2,3,4};

        // for (int row:rows) {
        //     System.out.println();
        //     for (int column:cols) {
        //         System.out.print("|row"+row+"-column" + column);
        // }

        // }

        // 3. While loop
        int row = 0;
        while (row < 4) {
            row++;
            System.out.println();
            int col = 0;
            while (col < 3) {
                col++;
                System.out.print("|Row " + row+"-Column " + col);
        }

        }
    }
}
