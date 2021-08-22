package practice.DataStructuresAndAlgorithms.B_List;

import practice.DataStructuresAndAlgorithms.Employee;

public class D_DoublyLinkedList {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee ("Bill", "End",78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

//        System.out.println(list.getSize());
//        list.addToEnd(billEnd);
//        list.printList();
//        list.removeFromFront();
//        list.printList();
//        System.out.println(list.getSize());
//        list.removeFromEnd();
//        list.printList();
//        System.out.println(list.getSize());

        list.addBefore(billEnd,johnDoe);
        list.printList();

        list.addBefore(new Employee("Someome","Else",1111),mikeWilson);
        list.printList();

    }
}
