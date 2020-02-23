package day44;

public class SlackUser {

    protected String name;
    protected String status;

    public void sendMessage() {

        System.out.println(name + " sends a message");
    }

    public void callSomeone() {
        System.out.println(name + " calls someone");
    }

    public void addEmoji() {

        System.out.println("Sets emoji to " + status);
    }

    public String getName() {

        return name;
    }

    public String getStatus() {

        return status;
    }

}
