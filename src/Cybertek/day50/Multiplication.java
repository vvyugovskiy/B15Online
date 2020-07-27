package Cybertek.day50;

public class Multiplication extends Question {

    public Multiplication(int num1, int num2) {
        super("Multiplication Question", "x");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 * num2;
        calculated = true;
    }

    @Override
    public String toString() {
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }
    }
}
