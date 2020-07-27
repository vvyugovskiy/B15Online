package practice.CodingBat;

public class Logic_1 {

    public static void main(String[] args) {

        System.out.println(cigarParty(40, true));

    }
    //-----------------------------------------------------------------------------------------------------------------
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
    //-----------------------------------------------------------------------------------------------------------------

}
