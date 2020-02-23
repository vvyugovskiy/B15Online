package office_hours.Practice_2020_01_27;

class data {

    private final String password = "123456";

    public String getPassword() {
        return password;
    }

//         public void setPassword (String password){
//        this.password = password;
//    }

    public final void printName() {
        System.out.println("Vladislav");
    }

    public final int printName(int a) {
        return 10;
    }
}

public class FinalKeyword extends data {

//    @Override
//    public void printName (){
//        System.out.println("Vladislav");
//    }

    final static double b = 100;
    // final long l;
    final int a = 200;

    public static void main(String[] args) {
        final int num = 100;
        // num = 300; ==>> cant change final
        System.out.println(num);

        final String username;

        System.out.println(b);

    }
}
