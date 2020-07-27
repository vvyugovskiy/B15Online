package practice.DataStructuresAndAlgorithms;

public class A_Array {

    public static void main(String[] args) {

        int [] intArray = new int [7]; // array index is 0-based
        intArray[0]=20;
        intArray[1]=35;
        intArray[2]=-15;
        intArray[3]=7;
        intArray[4]=55;
        intArray[5]=1;
        intArray[6]=-22;  // worse case if we search the entire array ==> Linear complexity

        int index = -1;
        for (int i=0; i<intArray.length; i++){
//            System.out.println(intArray[i]);
            if (intArray[i]==7){
                index = i;
                break;
            }
        }

        System.out.println("Index :: " + index);

        // Retrieve the index               => O(1)-Constant time
        // Retrieve without index           => O(n)-Linear time
        // Add an element to a full array   => O(n)
        // Add an element to the end of an array (has space)  => O(1)
        // Insert an update an element at a specific index    => O(1)
        // Delete an element by setting it to null            => O(1)
        // Delete an element by shifting elements             => O(n)
    }
}
