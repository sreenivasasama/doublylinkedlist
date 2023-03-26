package org.example;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode previousNode;
    private EmployeeNode nextNode;

    @Override
    public String toString() {
        return  employee.toString();
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(EmployeeNode previousNode) {
        this.previousNode = previousNode;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }
}
