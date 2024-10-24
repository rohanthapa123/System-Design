package org.example.lld.proxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee createEmployee(String role, Employee employee) throws Exception {
        return new Employee("Rohan Thapa", 1);
    }

    @Override
    public Employee getEmployee(String role, Integer empid) throws Exception {
        return new Employee("Name is here",empid);
    }

    @Override
    public String deleteEmployee(String role, Integer empid) throws Exception {
        return "EmployeeDeleted";
    }
}
