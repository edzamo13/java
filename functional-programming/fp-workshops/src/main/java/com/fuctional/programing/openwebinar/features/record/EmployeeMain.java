package com.fuctional.programing.openwebinar.features.record;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("employee1", 40000.0);
        System.out.println(employee);

        System.out.println(employee.id());
        System.out.println(employee.name());
        System.out.println(employee.salary());
    }
}
