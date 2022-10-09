class Bank {

    private String name;

    // Constructor of this class
    Bank(String name) {

        this.name = name;
    }

    // Method of Bank class
    public String getBankName() {
        // Returning name of bank
        return this.name;
    }
}

class Employee {
    // Attributes of employee
    private String name;

    // Employee name
    Employee(String name) {
        // This keyword refers to current instance itself
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}

class Practical12 {

    // Main driver method
    public static void main(String[] args) {

        
        Bank bank = new Bank("SBI");
        Employee emp = new Employee("prisha faldu");
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}
