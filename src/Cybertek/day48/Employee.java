package Cybertek.day48;


public abstract class Employee {

    String name;
    int ID;
    int annualSalary;

    public Employee(){

    }

    public Employee(String name, int ID){
        this.name = name;
        this.ID  = ID;
    }
    public abstract void calculateAnnualSalary ();

    public abstract String toString();




}
