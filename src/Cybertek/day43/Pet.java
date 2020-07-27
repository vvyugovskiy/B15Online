package Cybertek.day43;

public class Pet {

    private String type;
    private String name;

    public Pet() {
        this.type = "unknown";
        this.name = "no-name";

    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void speaks() {
        if (this.type.equalsIgnoreCase("cat")) {
            System.out.println("meow");
        } else if (this.type.equalsIgnoreCase("dog")) {
            System.out.println("woof");
        } else if (this.type.equalsIgnoreCase("cow")) {
            System.out.println("moo");
        } else if (this.type.equalsIgnoreCase("horse")) {
            System.out.println("neinei");
        } else {
            System.out.println("Unknown Animal");
        }
    }
     public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static void showGeneralPetInfo (){
        System.out.println("PETS ARE FRIENDS OF HUMANS");

        // System.out.println(name);
        // this will not work
        // Static Method can not access anything not-Static
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
