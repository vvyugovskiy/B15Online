package practice.DataStructuresAndAlgorithms.C_Stack;

import practice.DataStructuresAndAlgorithms.Employee;

public class B_LinkedStack {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);
        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Poped : "+ stack.pop());
        stack.printStack();
    }
}
