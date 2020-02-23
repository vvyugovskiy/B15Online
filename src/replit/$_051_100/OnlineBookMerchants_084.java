package replit.$_051_100;

import java.util.Scanner;

public class OnlineBookMerchants_084 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        // if premium (buy 5 or more get 1 free or 2 Free if buy 8):
        //regular get 1 free book if buy 7 or 2 free if buy 12 or more
        if (isPremiumCustomer==true){
            if (nbooksPurchased>=5 && nbooksPurchased <8) {
                freeBooks++;
            }else if (nbooksPurchased>=8)
                freeBooks+=2;
            System.out.println(freeBooks);
        }else if (isPremiumCustomer==false){
            if (nbooksPurchased>=7 && nbooksPurchased <12) {
                freeBooks++;
            }else if (nbooksPurchased>=12)
                freeBooks+=2;
            System.out.println(freeBooks);
        }
    }
}
