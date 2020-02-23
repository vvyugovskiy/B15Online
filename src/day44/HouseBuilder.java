package day44;

import javax.sound.midi.Soundbank;

public class HouseBuilder {
    public static void main(String[] args) {

        //CyberHouse.neighbourhoodName = "Brooklyn";
        CyberHouse.showNeighborhood();

        CyberHouse c1 = new CyberHouse("Vintage", 101);
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classic", 102);
        c2.showAllInfo();

        // System.out.println(CyberHouse.neighbourhoodName);

        // How do i get Max of a Short?
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
