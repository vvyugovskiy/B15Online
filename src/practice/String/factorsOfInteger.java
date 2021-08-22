package practice.String;
public class factorsOfInteger {
    public static void main(String[] args) {
        factors(120);
    }
    public static void factors (int i){
        int divisor = 2;
        while (i>0){
                if (i%divisor==0){
                    System.out.print(divisor+",");
                    i/=divisor;
                }else{
                    divisor++;
                }
            }
    }
}
