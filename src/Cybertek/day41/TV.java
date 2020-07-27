package Cybertek.day41;

public class TV {
    /**
     * TV
     * attributes :
     * brand , isOn , currentChannel
     * String , boolean , int   (range from 0-50)
     * behaviours :
     * turnOn
     * turnOff
     * getCurrentChannel
     * setCurrentChannel (newChannelNumber)
     * moveForward
     * moveBackward
     */
    String name;
    boolean isOn;
    int currentChannel;
    /**
     * A method to return the value of current channel for the TV
     *
     * @return the value of current channel for the TV
     */
    public int getCurrentChannel() {

        return currentChannel;
    }

    // we can not set a channel if the TV is off!!!
    // valid channel is from 0-50
    public void setCurrentChannel(int newChannel) {
        // if my channel is out of the range i want to xit from the method
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("INVALID CHANNEL, GETTING OUT");
            return; // early exit from the method
        }

        if (isOn == true) {
            currentChannel = newChannel;
        } else {
            System.out.println("TURN TV ON FIRST");
        }
    }
    public void turnOn() {
        System.out.println("Turning on TV");

        isOn = true;

    }

    public void turnOff() {
        if (isOn == true) {
            System.out.println("Turning off TV");
            isOn = false;
        }
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
