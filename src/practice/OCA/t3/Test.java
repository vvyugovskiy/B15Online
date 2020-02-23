package practice.OCA.t3;

class Employee {
    public int salary;
}
class Manager extends Employee {
    public int budget;
}
class Director extends Manager {
    public int stockOptions;
}
public class Test {
    public static void main(String[] args) {
        Employee elmployee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        // Line n1
//        employee.salary = 50_000;
//        director.stockOptions = 1_000;
//        manager.budget = 1_000_000 ;
//        manager.stockOption = 500;                 <<<=== FAIL
//        director.salary = 80_000;
//        Correct Answer employee.budget = 200_000;  <<<=== FAIL

    }
}
