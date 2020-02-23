package day23;

public class WarmUp_Array {
    public static void main(String[] args) {

        // create an int array of 7 items
        // assign a value
        // 1, print out in a reverse order
        // 2, store last item in a variable called lastItem
        // print it out separately
        // 3, print an item right in the middle
        // Find SUM, find avarage, find max, find min,
        // double the value of each item in this array
        int[] num = {1, 2, 7, 6, 9, 17};

        int[] numbers = new int[]{17, 69, 99, 15, 7, 3, 87};
        int max = numbers[0];
        for (int x = numbers.length - 1; x >= 0; x--) {
            System.out.print(numbers[x] + " ");
            if (numbers[x] > max) {
                // change max variable to this value
                max = numbers[x];
            }
        }
        System.out.println();
        System.out.println("Max : " + max);
        System.out.println("Middle value is : " + numbers[numbers.length / 2]);
//        if (numbers.length%2==0){
//            System.out.println(numbers[x]);
        int araySize = numbers.length;
        int lastItemIndex = araySize - 1;
        int lastItemValue = numbers[lastItemIndex];

        System.out.println("Last item : " + lastItemValue);
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum of Array numbers : " + sum);

    }
}