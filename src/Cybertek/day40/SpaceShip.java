package Cybertek.day40;

public class SpaceShip {

    //Create a class called SpaceShip
    //it has 4 attributes :
    //	name as String
    //	currentDirection as String  | up , down , right, left
    //	xCordinate as int
    //	yCordinate as int
    // few behaviours :
    // 	 setInitialPosition
    // 	 	accept 2 int parameters
    // 	 	to provide initial position of spaceship
    // 	 setDirection  void method
    // 	 	accept 1 String parameter to set the direction
    // 	 move1Block    void method
    // 	 	accept no parameter
    // 	 	and change the position according to the direction
    // 	 toString method
    // 	 	return String reperesntation of Spaceship Object

    // add a functionality to move1Block with direction provided in 1 shot

    public void move1Block (String newDirection){
        // we are reusing the functionality we already have to set the new direction
        setDirection(newDirection);
        move1Block();
    }

    String name;
    String currentDirection; // East, West, North, South
    int xCoordinate;
    int yCoordinate;

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    public void setInitialPosition(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public void setDirection(String newDirection) {
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
            currentDirection=""; // set to 0 if wrong direction
        }
    }
    public void move1Block() {
        switch (currentDirection) {
            case "up":
                yCoordinate++;
                break;
            case "down":
                yCoordinate--;
                break;
            case "right":
                xCoordinate++;
                break;
            case "left":
                xCoordinate--;
                break;
            default:
                System.out.println("No change in position!");
        }
    }
}
