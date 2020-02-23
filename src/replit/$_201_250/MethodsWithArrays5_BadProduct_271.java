package replit.$_201_250;

public class MethodsWithArrays5_BadProduct_271 {
    public static boolean badP(int[] products,int limit)
    {
        int cnt = 0;
        for (int i=0; i<products.length; i++){
            if (products[i]==0){
                cnt++;
            }
        }
        return limit>=cnt;
    }
    public static void main(String[] args) {

    }
}
