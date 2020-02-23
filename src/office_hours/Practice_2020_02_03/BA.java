package office_hours.Practice_2020_02_03;

public class BA extends ScrumTeam {

    /*
    inherited features:
            employeeName, jobTitle, salary
            getEmployeeInfo
     */
    public BA(String employeeName, double salary) {
        this.jobTitle = " Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;
    }


    @Override
    public void demo() {
        System.out.println("Business Analyst " + this.employeeName + " is doing demo");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Business Analyst " + this.employeeName + " attended the daily stand up");
    }

    public void gatherRequ() {
        System.out.println("Business Analyst " + this.employeeName + " is gathering the requiremnts");
    }

}
