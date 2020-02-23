package office_hours.Practice_2020_01_14;

public class ScrumTeam {

    public static void main(String[] args) {

        // we are going to creat an object

        //    object       reference
        ScrumTeamEmployee employee01 = new ScrumTeamEmployee();
        employee01.name = "Hasan";
        employee01.employee_ID = 123;
        employee01.jobTitle = "PO";
        employee01.age = 30;
        employee01.salary = 200000;
                                             // object
        ScrumTeamEmployee employee02 = new ScrumTeamEmployee();
        employee02.jobTitle = "Tester";
        employee02.name = "Maiia";
        employee02.employee_ID = 234;

        employee02.standUp();
                                             // object
        ScrumTeamEmployee employee03 = new ScrumTeamEmployee();
        employee03.jobTitle = "Developer";
        employee03.name = "Ershat";
        employee03.employee_ID = 345;

        employee03.standUp();

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Employee's 01 name : " + employee01.name);
        System.out.println("Employee's 01 job title : " + employee01.jobTitle);
        System.out.println("Employee's 01 ID : " + employee01.employee_ID);

        employee01.getEmployeeInfo();
        employee01.demo();
        employee02.demo();
        employee03.demo();
    }
}
