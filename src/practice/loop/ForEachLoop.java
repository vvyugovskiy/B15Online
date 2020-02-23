package practice.loop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 11, 6, 123};
        for (int item : ints) {
            if (item % 2 == 0)
                System.out.println("items :" + item);

        }

        String[] strs = {"aaa", "bb", "cafd"};
        for (String letters : strs) {
            if (letters.contains("b")) {
                System.out.println("Found b, getting out");
                break;
            }
            System.out.println(letters);
        }
        for (int i = 0; i < strs.length; i++) {
            String letters = strs[i];
            System.out.println(letters );
        }


    }
}