package office_hours.Practice_2020_01_14;

public class ScrumTeamEmployee {
    // Scrum team employee's info
    // SM, PO, developers
    String jobTitle;
    String name;
    double salary;
    int employee_ID;
    int age;

    // what can Scrum team do? actions? -->> Methods

    public void standUp() {
        System.out.println("This team's stand up meeting is at 10:45AM");
    }
    // create a method that will print all the information about the employee

    public void demo (){
        System.out.println(name+" - is doing demo");
    }

    public void getEmployeeInfo() {
        System.out.println("ScrumTeamEmployee : " +'\n' +
                "Job Title='" + jobTitle + '\n' +
                "Name='" + name + '\n' +
                "salary=" + salary + '\n' +
                "Employee_ID=" + employee_ID +'\n' +
                "Age=" + age );
    }

    public static void main(String[] args) {

        System.out.println("Hello World");

        int i = 9;
        String word = "Cybertek";

//        int number;
//        System.out.println(number); // DOES not compile, need to be declared
    }

    public void hi() {
        String name = "Asia"; // local variable
    }

    public void hello(String name) { // local variable

    }
}
