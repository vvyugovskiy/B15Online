package replit.$_201_250;

import java.util.*;

public class MethodsWithArrayLists13DeliveryCalc_211 {

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        int refuelNumber=0;
        for (int i = 0; i < deliveries.size(); i++) {
            refuelNumber+=deliveries.get(i);
        }
        int timesRefuel = ( refuelNumber%max_fuel==0) ? refuelNumber/max_fuel : (refuelNumber/max_fuel)+1;
//        if (refuelNumber%max_fuel==0){
//            timesRefuel=refuelNumber/max_fuel;
//            return  timesRefuel;
//        }else if (refuelNumber%max_fuel!=0){
//            timesRefuel++;
//        }
        return timesRefuel;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr, 3);
        System.out.print(times);//should output 5


    }
}
