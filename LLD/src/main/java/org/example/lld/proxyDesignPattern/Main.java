package org.example.lld.proxyDesignPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeProxy();
        employeeDao.createEmployee("ADMIN", new Employee("Rohan Thapa", 2));
        System.out.println(employeeDao.getEmployee("USER", 1));
        System.out.println(employeeDao.deleteEmployee("ADMIN", 2));
        try {

            employeeDao.createEmployee("USER", new Employee("Rohan Thapa", 2));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
