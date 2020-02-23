package day48;

public class HourlyEmployee extends Employee{

    int hourlyWage;
    int numsOfHours ;

    public HourlyEmployee (String name, int ID, int hourlyWage, int numsOfHours){
        super(name, ID);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }
    public void calculateAnnualSalary (){
        annualSalary = hourlyWage*numsOfHours*12;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name=" + name +
                ", numsOfHours=" + numsOfHours +
                ", hourlyWage='" + hourlyWage + '\'' +
                ", ID=" + ID +
                '}';
    }
}
