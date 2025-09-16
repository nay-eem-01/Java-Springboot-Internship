package org.example.OOP.Problem1;

import java.util.Objects;

public final class Employee {
    private final Long id;
    private final String name;
    private final String department;
    private final String address;

    public Employee(Long  id, String name, String department, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;

        return Objects.equals(id, employee.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long  getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee name: " +name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101L,"nayeem","IT","Tongi");
        Employee employee1 = new Employee(101L,"nayeem","IT","Tongi");

        System.out.println(employee.equals(employee1));
        System.out.println(employee.hashCode());

    }
}
