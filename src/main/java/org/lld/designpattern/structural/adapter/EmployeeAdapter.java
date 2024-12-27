package org.lld.designpattern.structural.adapter;


import java.util.List;

public interface EmployeeAdapter {
    List<Employee> getEmployee(List<EmployeeDto> employeeDtoList);
}
