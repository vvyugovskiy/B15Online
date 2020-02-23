package day61_linkedList;

import java.util.*;

public class JobHunter {


    public static void main(String[] args) {

        Job j1 = new Job("GA", 120000, "BOFA");
        Job j2 = new Job("VA", 110000, "Amazon");
        Job j3 = new Job("VA", 150000, "Tesla");

        System.out.println("j1.compareTo(j2)" + j1.compareTo(j2));
        System.out.println("j2.compareTo(j3)" + j2.compareTo(j3));


        List<Job> myFavJob = new LinkedList<>();
        myFavJob.add(new Job("GA", 120000, "BOFA"));
        myFavJob.add(new Job("VA", 110000, "Amazon"));
        myFavJob.add(new Job("NY", 140000, "FaceBook"));
        myFavJob.add(new Job("CA", 150000, "Apple"));
        myFavJob.add(new Job("WA", 145000, "Microsoft"));

        System.out.println("myFavJob before = " + myFavJob);
        // How SORT METHOD SORTS?
        // IT IS USING COMPARING LOGIC PROVIDED INSIDE
        // compareTo (Job other) method
        // then SORT them accordingly
        Collections.sort(myFavJob);
        System.out.println("myFavJob before = " + myFavJob);
        //Collections.sort(myFavJob, Comparator.reverseOrder());
        //Collections.reverse(myFavJob);
        Collections.reverse(myFavJob);
        System.out.println("myFavJob" + myFavJob);

        // what's the difference between Collections.reverseOrder()
        // and Comparator.reverseOrder()
        // both of them will give you an Comparator object with reversed logic
        // they are just at two different place
        // one is the static method of Comparator interface
        // another is static method of Collections class
        // no functional difference at all , they happen to have same name

    }
}
