package org.lld.designpattern.creational.builder;

public class EmployeeBuilderTest {

    public static void main(String[] args) {

        Employee employee = Employee.employeeBuilder()
                .setName("Suyash")
                .setAddress("Zurich")
                .setDob(231095L)
                .setEmpId("1")
                .build();

        System.out.println(employee);

    }
}
