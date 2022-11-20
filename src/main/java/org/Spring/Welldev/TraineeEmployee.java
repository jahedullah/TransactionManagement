package org.Spring.Welldev;

public class TraineeEmployee implements WellEmployee{

    private int Id;
    private double salary;
    private String name;

    @Override
    public void giveRaise(double amount) {
        this.salary += amount;
    }

    @Override
    public void payCut(double amount) {
        this.salary -= amount;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
