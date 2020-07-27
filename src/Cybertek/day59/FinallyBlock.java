package Cybertek.day59;

public class FinallyBlock {

    public static void main(String[] args) {

        // in some cases we want to run certain code
        // no mater exception happen or not
        // as part of try/catch

        int[] nums = {1, 4, 6};

        try {
            System.out.println("nums[5] = " + nums[100]);
//             throw new ArrayIndexOutOfBoundsException ("Index 100 out of bounds for length 3");

//              an ArrayIndexOutOfBoundsException object is created and thrown to the runtime system

//             throw new ArrayIndexOutOfBoundsException("Index 100 out of bounds for length 3");

        } catch (Exception e) {

            // HOW DO I GET THE MESSAGE OUT OF THE EXCEPTION OBJECT
            // Any exception object (can) have message field
            // and it can be extracted by calling getMessage method

            System.out.println("Exception caught \n " + e.getMessage());

        }finally {

            System.out.println("This code will always run NO MATER WHAT");
        }

        System.out.println("THE END");
    }
}
