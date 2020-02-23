package day48;

public class FullTimeEmployee extends Employee {

    int monthlySalary;

    public FullTimeEmployee (String name, int ID, int monthlySalary){
        super (name, ID);
        this.monthlySalary = monthlySalary;
    }

    public void calculateAnnualSalary (){
        annualSalary=monthlySalary*12;
    }
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name=" + name +
                ", monthlySalary='" + monthlySalary + '\'' +
                ", ID=" + ID +
                '}';
    }
}
