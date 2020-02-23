package replit.$_151_200;

public class MethodOverloading1_188 {
    public static void main(String[] args) {

    }
    public int findMax (int[]arr ){
        int maxumum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxumum){
                maxumum=arr[i];
            }
        }
        return maxumum;
    }
    public double findMax (double[] arr){
        double maxumum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxumum){
                maxumum=arr[i];
            }
        }
        return maxumum;
    }
}
