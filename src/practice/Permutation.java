package practice;

// Java program to print all permutations of a
// given string.
public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n - 1);
        int count=0;
    }
    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    public void permute(String str, int l, int r) {
        int count=0;
        if (l == r) {
            System.out.println(str + " = " + count);
        } else {
            for (int i = l; i <= r; i++) {
                count++;
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
                //count++;
            }
        }
    }
    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
