package day54.interface_as_reference;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Makeup();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        // here directly passing the object without storing into a variable
        wearMyWearable(new Watch());
//        wearMyWearable(  new String()  ); String is not a Wearable

        String result1 = getMyString();
        System.out.println("result1 = " + result1);


        System.out.println("\n ----calling the getMyWearableObject--- \n");
        Wearable result = getMyWearable();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());
        wearMyWearable(result);


    }


    public static String getMyString() {

        return new String("bla bla bla");
    }

    // made is static so we can just call it directly
    public static void wearMyWearable(Wearable any) {

        any.wear();
    }

    public static Wearable getMyWearable() {
//        Wearable f = new Clothes() {
//        return f;
//        };
        // return new Perfume();
        // return new Watch();
        // return new Clothes();
        return new Makeup();

    }
}
