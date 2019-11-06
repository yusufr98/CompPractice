package com.company;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education edu;
    public Person(){
        this.job= new Job();
        job.setSalary(1000L);
        this.edu = new Education();
    }

    public Person(Job job, Education edu) {
        this.job = job;
        job.setSalary(1000L);
        this.edu = edu;
    }

    @Override
    public String toString() {
        return "Person{" +
                "job=" + job.toString() +
                ", edu=" + edu.toString() +
                '}';
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEdu() {
        return edu;
    }

    public void setEdu(Education edu) {
        this.edu = edu;
    }

    public long getSalary() {
        return job.getSalary();
    }
}