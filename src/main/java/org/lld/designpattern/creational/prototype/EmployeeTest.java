package org.lld.designpattern.creational.prototype;

public class EmployeeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee();
        employee.setEmpId("1");
        employee.setName("Suyash");
        employee.setDob(234489L);
        employee.setAddress("Zurich");

        System.out.println(employee);
        System.out.println(employee.hashCode());

        Employee cloneEmployee = employee.clone();
        employee.setDob(90980);
        System.out.println(employee);
        System.out.println(cloneEmployee);
        System.out.println(cloneEmployee.hashCode());
    }
}
