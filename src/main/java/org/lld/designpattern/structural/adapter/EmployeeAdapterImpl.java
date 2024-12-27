package org.lld.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapterImpl implements EmployeeAdapter {


    @Override
    public List<Employee> getEmployee(List<EmployeeDto> employeeDtoList) {
        List<Employee> employees = new ArrayList<>();
        employeeDtoList.forEach(employeeDto -> {
            Employee employee = new Employee();
            employee.setName(employeeDto.getFirstName() + " " + employeeDto.getLastName());
            employee.setAddress(employeeDto.getAddress());
            employee.setAge(employeeDto.getAge());
            employee.setEmpId(employeeDto.getEmpCode());
            employees.add(employee);
        });
        return employees;
    }
}
