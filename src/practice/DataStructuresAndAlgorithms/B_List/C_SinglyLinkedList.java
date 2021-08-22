package practice.DataStructuresAndAlgorithms.B_List;

import practice.DataStructuresAndAlgorithms.Employee;

public class C_SinglyLinkedList {
    /*
    Each item in the list is called a node
    The first item in the list is the head of the list
    Singly-linked List

    Insert:
    1.Create a new node 'Bill'
    2.Assign 'Jane' to the next field
    3.Assign head to 'Bill'
    4.Will be O(1) time complexity

    Delete:
    1.Assign 'Bill' to temporary variable 'removedNode'
    2.Assign 'head' to 'Jane'
    3.Return 'removedNode'
    4.Will be O(1) time complexity
     */
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        System.out.println(list.getSize());
        list.printList();
//        System.out.println(list.isEmpty());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }


}
