package Cybertek.day41;

public class Person {

    //private makes it only accessible within the same class
    private String name;
    private int age;
    private long ssn;

    // what if i want to only get the name
    public  String getName (){
        return name;
    }

    // what if i only want to change the name
    public void setName (String newName){
        name= newName;
    }

    public int getAge (){
        return age;
    }

    public void setAge (int newAge){
        age=newAge;
    }
    public int getSsn (){
        return age;
    }

    public void setSsn (int newSsn){
        age=newSsn;
    }

    // write a method to give value to the filled
    public void setAll (String newName, int newAge, long newSsn){
        // YOU CAN PUT WHATEVER CHECK HERE TO MAKE SURE
        // THE DATA IS CORRECT or any other logic
        name = newName;
        age = newAge;
        ssn = newSsn;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
