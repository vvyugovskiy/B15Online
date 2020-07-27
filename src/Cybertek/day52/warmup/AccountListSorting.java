package Cybertek.day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountLst = new ArrayList<>();
        accountLst.add(new Account("Jon", 10000));
        accountLst.add(new Account("Vlad", 11000));
        accountLst.add(new Account("Svetlana", 13000));
        accountLst.add(new Account("Muhammed", 8000));
        accountLst.add(new Account("Emma", 17000));
        accountLst.add(new Account("Asena", 15000));

        Account vV = new Account("Vvv",0);

        for (Account each: accountLst) {
            each.transferAll(vV);
        }

        System.out.println("Account before = \n" + accountLst);
        Collections.sort(accountLst);
        System.out.println("Account after = \n" + accountLst);

        System.out.println("vV = " + vV);
        System.out.println("accountLst = " + accountLst);

        Account a1 = new Account("Polymorphism", 10000);
        Transferable t1 = new Account("Polimorphism2", 10000);
        Object o1 = new Account ("Polimorphism3",10000);



    }
}
