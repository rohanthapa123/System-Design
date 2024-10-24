package org.example.lld.proxyDesignPattern;

public class EmployeeProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeProxy(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public Employee createEmployee(String role, Employee employee) throws Exception {
        if(role == "ADMIN"){
            return employeeDao.createEmployee(role,employee);
        }else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public Employee getEmployee(String role, Integer empid) throws Exception {
        if(role == "USER" || role == "ADMIN"){
            return employeeDao.getEmployee(role,empid);
        }else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public String deleteEmployee(String role, Integer empid) throws Exception {
        if(role == "ADMIN"){
            return employeeDao.deleteEmployee(role,empid);
        }else {
            throw new RuntimeException("Access Denied");
        }
    }
}
