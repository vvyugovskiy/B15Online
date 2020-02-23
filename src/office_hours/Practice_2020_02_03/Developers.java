package office_hours.Practice_2020_02_03;

public class Developers extends ScrumTeam {
    /*
        Inherited features:
                    employeeName, jobTitle, salary
                    getEmployeeInfo(
         */
    public Developers(String employeeName, double salary) {
        this.jobTitle = "Software developer";
        this.employeeName = employeeName;
        this.salary = salary;
    }


    @Override
    public void demo() {
        System.out.println("Developer " + this.employeeName + " is doing demo");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Developer " + this.employeeName + " attend the daily stand up");
    }


    public void fixingBugs() {
        System.out.println("Developer " + this.employeeName + " is crying");
    }

}
