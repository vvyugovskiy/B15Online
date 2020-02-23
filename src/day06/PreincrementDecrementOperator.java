package day06;

public class PreincrementDecrementOperator {

    public static void main(String[] args) {
        int offerCount = 2;

        // offerCount = offerCount+1;
       // offerCount +=1;

        ++ offerCount;

        System.out.println("Offer Now " + offerCount);
        offerCount +=3;
        System.out.println("New offer " + offerCount);
        offerCount %=4;
        System.out.println("3rd offer " + offerCount);

    }
}
