package practice.Array;

import java.util.Arrays;

/**
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * Given A = [1, 2, 3], the function should return 4.
 * Given A = [−1, −3], the function should return 1.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Solution {
    public static void main(String[] args) {

        int[] a = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(a));
    }

    public static int solution(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        if (a[a.length - 1] < 0) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] < 2) {
                continue;
            } else {
                return a[i] + 1;
            }
        }
        return a[a.length - 1] + 1;
    }
}
