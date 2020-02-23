package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
//        System.out.println(s1.allProducts);
        System.out.println("s1 = " + s1);

//        s1.allProducts.add(new Product("imac", 3999));
//        System.out.println(s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("cookie", 2),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("muffins", 5),
                new Product("nut", 7),
                new Product("Frappecino", 8),
                new Product("double shot", 15)
        );

        Store s2 = new Store("Denis Store", denisList);
        System.out.println("s2 = " + s2);

        System.out.println("s2.findSumOfAllProductPrice() = " + s2.findSumOfAllProductPrice());
        System.out.println("s2.getAveragePrice() = " + s2.getAveragePrice());

        System.out.println("Most Expensive Product = " + s2.getMostExpensiveProduct());

        System.out.println("More Than Average Price() = \n" + s2.getAllProductsMoreThanAveragePrice());

    }
}