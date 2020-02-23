package replit.$_201_250.OOP8_ParkingMeter227;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;


    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int a) {
        if (timeLeft + 30 <= maxTime) {
            if (a == 25) {
                timeLeft += 30;
                return true;
            }
            return false;
        }
        return false;
    }

    public void tick() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    public boolean isExpired() {
        boolean value = false;
        if (timeLeft == 0) {
            value = true;
            return value;
        }
        return value;
    }

    double amount;
    double capacity;
    double x;

    public double fillUp() {
        //double x;
        capacity = amount + x;
        return x;
    }


}
