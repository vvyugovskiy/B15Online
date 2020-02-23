package day13;

public class WarmUp_Amazon {
    public static void main(String[] args) {

        /*
        Amazon has 2 types of users: Prime and Regular Users
        Prime get the Free shipping no mater waht amount is
        Regular User get free shipping only if Purchase is more than $25
        Otherwise they have to pay the shipping fee
         */
        int shippingFee = 0;
        String memberType = "Prime gember";
        double amount = 45.99d;
        // first i want to know if its a Prime member or not
        if (memberType.equalsIgnoreCase("Prime member")) {
            System.out.println("You get 1 day free shipping");
            System.out.println("Your shipping is free " + amount);
        } else if (amount > 25) {
            System.out.println("You are not a prime member");
            System.out.println("Your Get A Free Shipping " + amount);
        } else {
            System.out.println("Do You want to Get A Prime?");
            shippingFee = 5;
            amount=amount+shippingFee;
            System.out.println("Final Amount is : "+amount);
        }
    }
}