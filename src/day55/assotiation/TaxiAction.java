package day55.assotiation;

public class TaxiAction {

    public static void main(String[] args) {

        //as soon as we want to create Taxi t1 object we need Engine eng to pass
// so first we created Engine so that we can pass when we create Taxi t1 object
// Any class can be a data type...

        Engine en = new Engine("V6", 400);
        Driver d = new Driver("Pedro", 12345);
        // print a first char of the Driver name
        System.out.println(d.name.charAt(0));

        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1" + t1.toString());
// when we print t1 we get a described out put as we have toString in Taxi class
// we also get a nice output for eng because we also have a toString in our Engine class.
// Taxi has plateNumber and eng, at the same time eng has its own type and horsePower
// so we get all when we have toString ---> association. relationship between two separate classes.

        Taxi t2 = new Taxi(102,
                new Engine("V8", 600),
                new Driver("Fatmir", 54321));
        System.out.println("t2 = " + t2);
        // print out drivers name and car horse power
        // driver <name> is driving the taxi with HPW <> on the HWY
        // System.out.println(t2.dr.name);

        // How do i store a plate number in a variable x:
        int x = t2.plateNumber;
        // how do i store the t2 Driver in a variable
        Driver y = t2.dr;
        // how do i store the t2 Engine in a variable
        Engine z = t2.eng;
        System.out.println("Driver name is " + y.name);
        System.out.println("Driver name is " + t2.dr.name);

        // how to get the horse power of the taxi
        System.out.println("Taxi t2\' horsepower : "+t2.eng.horsePower);
        // how to get a Drivers' name first letter?
        System.out.println(t2.dr.name.charAt(0));


    }
}
