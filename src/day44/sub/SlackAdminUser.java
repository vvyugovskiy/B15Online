package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public SlackAdminUser(String name, String status, int adminId) {
        //super(name, status);
        this.name = name;
        this.status = status;
        this.adminId = adminId;
    }

    public static void main(String[] args) {

        SlackAdminUser sl1 = new SlackAdminUser("Vladislav", "Active", 17986);
        System.out.println("sl1 = " + sl1.getName());
        System.out.println("sl1 = " + sl1.getStatus());
        // ------inherited methods from SlackUser superClass
        sl1.sendMessage();
        sl1.callSomeone();
        sl1.addEmoji();
        //----our own methods we are calling
        sl1.sendAtChannelMessage();
        sl1.deleteMessage();
        sl1.addChannel();
        System.out.println("sl1 = " + sl1);
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void sendAtChannelMessage() {
        System.out.println(name + " sends a message at the channel");
    }

    public void deleteMessage() {
        System.out.println(name + " deletes a message");
    }

    public void addChannel() {
        System.out.println(name + " adds a new channel");
    }

}
