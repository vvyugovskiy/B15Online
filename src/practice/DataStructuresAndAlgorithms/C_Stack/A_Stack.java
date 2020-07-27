package practice.DataStructuresAndAlgorithms.C_Stack;

public class A_Stack {
    /*
    Abstract data type
    LIFO - Last in, first out
    push - adds an item as the top item on the stack
    pop - removes the top item on the stack
    peek - gets the top item on the stack without popping it
    Ideal backing data structure: Linked List

    TIME COMPLEXITY:
    O(1) for push, pop and peek when using a linked list
    If use an array, then push is O(n), because array might need to be resized
    If max number of items that ever be on the stack is known, an array can be a good choice.
     */
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane","Jones",123));
        stack.push(new Employee("John","Doe",4567));
        stack.push(new Employee("Mary","Smith",22));
        stack.push(new Employee("Mike","Wilson",3245));
        stack.push(new Employee("Bill","End",78));
//        stack.printStack();
        System.out.println(stack.peek());



    }
}
