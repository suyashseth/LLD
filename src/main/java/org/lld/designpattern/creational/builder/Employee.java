package org.lld.designpattern.creational.builder;

public class Employee {

    private String name;
    private String empId;
    private long dob;
    private String address;

    private Employee() {}

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setDob(long dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                '}';
    }

    public static EmployeeBuilder employeeBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {

        private String name;
        private String empId;
        private long dob;
        private String address;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder setDob(long dob) {
            this.dob = dob;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Employee build() {
            Employee emp = new Employee();
            emp.setName(this.name);
            emp.setAddress(this.address);
            emp.setDob(this.dob);
            emp.setEmpId(this.empId);
            return emp;
        }

    }
}
