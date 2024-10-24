package org.example.lld.proxyDesignPattern;

public class Employee {
    String name;
    Integer empid;

    public Employee(String name, Integer empid) {
        this.name = name;
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}
