package org.example;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNextNode(head);
        if(isEmpty()) {
            tail = employeeNode;
        } else {
            head.setPreviousNode(employeeNode);
        }
        employeeNode.setPreviousNode(null);
        head = employeeNode;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void addAtLast(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setPreviousNode(tail);
        if(isEmpty()) {
            head = employeeNode;
        } else {
            tail.setNextNode(employeeNode);
        }
        employeeNode.setNextNode(null);
        tail = employeeNode;
        size++;

    }

    public void addAfterEmployee(Employee newEmployee, Employee oldEmployee){
        EmployeeNode node = new EmployeeNode(newEmployee);
        EmployeeNode oldEmployeeNode = head;
        while(oldEmployeeNode!=null) {
           if(!oldEmployeeNode.getEmployee().equals(oldEmployee)) {
               oldEmployeeNode = oldEmployeeNode.getNextNode();
           } else {
               break;
           }
        }
        System.out.println("employee found =>" + oldEmployeeNode.toString());
        if(oldEmployeeNode != null) {
            node.setNextNode(oldEmployeeNode.getNextNode());
            node.setPreviousNode(oldEmployeeNode);
            oldEmployeeNode.getNextNode().setPreviousNode(node);
            oldEmployeeNode.setNextNode(node);
        }
        size++;
    }
    public Employee removeFromFront() {
        if(isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNextNode();
        head.setPreviousNode(null);
        size--;
        return head.getEmployee();
    }

    public void printListForward() {
        EmployeeNode current = head;
        while(current!= null ) {
            System.out.print(current.getEmployee().toString());
            System.out.print("<=>");
            current = current.getNextNode();
        }
        System.out.print("null");

    }

    public void printListBackward() {
        EmployeeNode current = tail;
        while(current!= null ) {
            System.out.print(current.getEmployee().toString());
            System.out.print("<=>");
            current = current.getPreviousNode();
        }
        System.out.print("null");

    }
}
