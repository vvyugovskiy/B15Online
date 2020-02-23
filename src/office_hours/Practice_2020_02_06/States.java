package office_hours.Practice_2020_02_06;

import day43.StarbuckUtil;

public abstract class States {

    String statesName;
    public void tax (){
        System.out.println("Tax rate is 5%");
    }

    public final void method1 (){
        System.out.println("method  1 from States class");
    }


}

class Kentucky extends States {

    String stateName = "KY";

    public void tax() {
        System.out.println("Tax Rate in KY is 6%");
    }

    public void KFC() {
        System.out.println("KY has KFC");
    }

    public final void method1(int a) {
        System.out.println("method1 from Kentucky");
    }
}

class California extends States {
    String stateName = "CA";

    public void tax() {
        System.out.println("Tax Rate in California is 9%");
    }

    public void hollywood() {
        System.out.println("there is hollywood in CA");
    }

    public final void method1(int a) {
        System.out.println("method1 from Kentucky");
    }
}