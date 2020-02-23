package day50;

public abstract class Question {


    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";  // setting default value to unknown directly

    public Question(String questionType, String operator) {
        this.operator = operator;
        this.questionType = questionType;
    }

    public abstract void calculate();

    @Override
    public String toString() {
        return "The question type is " + questionType + " : ";
    }
}
