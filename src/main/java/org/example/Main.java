package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Employee employee1 = new Employee("Rishi", 12, 100000.00);
        Employee employee2 = new Employee("Sreeni", 12, 200000.00);
        Employee employee3 = new Employee("Shailu", 12, 300000.00);
        Employee employee4 = new Employee("bobby", 22, 4300000.00);
        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        employeeDoublyLinkedList.addToFront(employee1);
        employeeDoublyLinkedList.printListForward();
        System.out.println("\n");
        employeeDoublyLinkedList.addToFront(employee2);
        employeeDoublyLinkedList.printListForward();
        System.out.println("\n");
        employeeDoublyLinkedList.addAtLast(employee3);
        employeeDoublyLinkedList.printListForward();
        System.out.println("\n");
        employeeDoublyLinkedList.printListBackward();
        System.out.println("\n");
        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.printListForward();
        System.out.println("\n");
        employeeDoublyLinkedList.addAfterEmployee(employee4,employee1);
        employeeDoublyLinkedList.printListForward();

    }
}