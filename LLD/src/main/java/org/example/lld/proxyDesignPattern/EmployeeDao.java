package org.example.lld.proxyDesignPattern;

public interface EmployeeDao {
    Employee createEmployee(String role, Employee employee) throws Exception;
    Employee getEmployee(String role, Integer empid) throws Exception;
    String deleteEmployee(String role, Integer empid) throws Exception;
}
