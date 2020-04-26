package day62_set;

import day61_linkedList.Job;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // we want the Jobs automatically sorted by natural order (salary)
        // while we are adding them into the Collection object
        // so we chose SortedSet fro this.

        // create a SortedSet of Job (from day 61 ) with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> jobs = new TreeSet<>();
        jobs.add(new Job("GA", 120000, "BOFA"));
        jobs.add(new Job("VA", 110000, "Amazon"));
        jobs.add(new Job("NY", 140000, "FaceBook"));
        jobs.add(new Job("CA", 150000, "Apple"));
        jobs.add(new Job("WA", 145000, "Microsoft"));

        // FOR LOOP WAY
//        for (Job eachJob :jobs) {
//            System.out.println("eachJob = " + eachJob);
//        }

        // LAMBDA WAY
        jobs.forEach(each-> System.out.println("each = " + each));

        // HOW DOES HashSet decides if the value is unique

        Job bestSalaryJob = jobs.last();
        System.out.println("Best Salary Job Company Name = " + bestSalaryJob.getCompanyName()
                + ",  Located at " + bestSalaryJob.getLocation());

    }
}
