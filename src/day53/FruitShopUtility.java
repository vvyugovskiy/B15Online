package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit fx = null;  //new Orange("sour", "orange", 12);// new Apple("crispy but tasteless", "hot red", "Gala");
        // can we directly pass any object IS-A Fruit rather than saving it into a variable
        Fruit f1 = new Apple("crispy", "hot-red", "Gala");
        Fruit f2 = new Orange("sour", "Orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f1);
        digestBetter(new Orange("sweet", "Orange", 10));
        System.out.println("_____________________________My_Favorite_____________________");

        System.out.println(getMyFavoriteFruit());

        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("B15 favorite fruit : " + x);
        System.out.println("_____________________________Favorite_By_Type_____________________");
        System.out.println(gerFavoriteByType(1));
        System.out.println(gerFavoriteByType(2));
        System.out.println(gerFavoriteByType(17));
    }

    // Create a static method called GetFavoriteByType
    // it has one int parameter
    // return favorite apple object if type is 1 , orange object if type 2
    public static Fruit gerFavoriteByType(int a) {
        if (a == 1) {
            return getMyFavoriteFruit();

        } else if (a == 2) {
            return new Orange("Yammy", "Yellowish", 17);
        }
        // we can return null for any method that return reference type
        // because null can be assigned to a reference type variable
        return null;
    }

    // Create a static void method called digestBetter
    // it has a parameter as type Fruit
    // and inside the method , it will digest the Fruit object 4 time then displayInformation
    public static void digestBetter(Fruit anyFruit) {
        for (int i = 0; i < 4; i++) {
            System.out.println(anyFruit);
        }
    }

    // Create a static method called getMyFavoriteFruit
    // accept no parameter and return your Favorite Fruit Object
    public static Fruit getMyFavoriteFruit() {
        return new Apple("Sweet and Crisp", "Yellow", "Opal");
    }

    // displayFruit
    public static void displayFruit(Fruit blabla) {
        System.out.println("Displaying fruit \n\t\t\t" + blabla);
    }


    // sellFruit

    // buyFruit
}
