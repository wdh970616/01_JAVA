package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO{
    private int salary;
    private String dept;

    @Override
    public String information() {
        return super.information() + ", 급여 : " + salary + ", 부서 : " + dept;
    }

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
