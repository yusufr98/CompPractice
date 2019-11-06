package com.company;

public class Job {
    private String role;
    private long salary;
    private int id;
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Job{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}