package practice.Lambda;

public class Person {

    protected int age;
    protected String name;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public int getAge()
    {
        return age;
    }
}
